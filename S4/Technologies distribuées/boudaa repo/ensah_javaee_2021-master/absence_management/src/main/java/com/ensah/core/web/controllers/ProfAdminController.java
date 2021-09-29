package com.ensah.core.web.controllers;

import com.ensah.core.bo.*;
import com.ensah.core.dao.IEnseignantDao;
import com.ensah.core.services.*;
import com.ensah.core.web.models.AbsenceModel;
import com.ensah.core.web.models.NiveauModule;
import com.ensah.core.web.models.PersonModel;
import com.ensah.core.web.models.UserAndAccountInfos;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/prof")
public class ProfAdminController {

    @Autowired
    private IEnseignantDao EnseignantService;

    @Autowired
    private ITypeSeanceService seanceService;

    @Autowired
    private IModuleService moduleService;

    @Autowired
    private INiveauServiceImpl niveauService;

    @Autowired
    private IetudiantService etudiantService;


    @Autowired
    private IUtilisateurService utilisateurService;


    @Autowired
    private IinscreptionsService inscriptionService;

    @Autowired
    private IAbsenceService absenceService;

    @Autowired
    private IMatierService matierService;

    @Autowired
    private HttpSession httpSession;


    public ProfAdminController() {
    }
    private UserAndAccountInfos getUserAccount() {

        // On vérifie si les infors de l'utilisateur sont déjà dans la session
        UserAndAccountInfos userInfo = (UserAndAccountInfos) httpSession.getAttribute("userInfo");

        if (userInfo == null) {

            // On obtient l'objet representant le compte connecté (Objet UserPrincipal
            // implémentant UserDetails)
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

            // On cast vers notre objet UserPrincipal
            Compte userAccount = ((UserPrincipal) principal).getUser();

            Utilisateur u = userAccount.getProprietaire();

            String roleName = userAccount.getRole().getNomRole();

            userInfo = new UserAndAccountInfos(u.getIdUtilisateur(), userAccount.getIdCompte(), userAccount.getLogin(),
                u.getNom(), u.getPrenom(), u.getEmail(), roleName);

            // On le stocke dans la session
            httpSession.setAttribute("userInfo", userInfo);
        }

        return userInfo;

    }

    @RequestMapping(value = "searchClass",method = RequestMethod.GET)
    private String searchClass(Model model){


        model.addAttribute("NiveauList",niveauService.getAllNiveau());



        return "prof/searchClass";
    }

    @RequestMapping(value = "getListEtudiants/{idNiveau}",method = RequestMethod.GET)
    private String listEtudiant(@PathVariable Long idNiveau, Model model){

            NiveauModule niveauModule = new NiveauModule(Long.valueOf(idNiveau));


            model.addAttribute("niveauModule",niveauModule);



           List<Inscription>  inscriptions = inscriptionService.getInscriptionByIdNiveau(String.valueOf(idNiveau));

            model.addAttribute("inscriptions",inscriptions);



        return "prof/ListEtudiant";
    }

    @RequestMapping(value = "absenceForm", method = RequestMethod.GET)
    public String absenceForm(@RequestParam Long idInscription, Model model) {


        AbsenceModel amodel = new AbsenceModel();
        amodel.setIdInscription(idInscription);

        model.addAttribute("absenceModel",amodel);


        model.addAttribute("matiers",matierService.getAllMatiers());


        return "prof/absenceForm";
    }

//    @RequestMapping(value = "setAbsence")
//    public String setAbsence(@RequestParam Long idInscription,@ModelAttribute("absenceModel")
//        AbsenceModel amodel,  Model model,BindingResult bindingResult, HttpServletRequest rq){
//
//// @Valid @ModelAttribute("absenceModel")  AbsenceModel amodel,
//
//
//
//         Absence absence = new Absence();
//
//         BeanUtils.copyProperties(amodel, absence);
//         absenceService.createAbsence(absence);
//
//
//
//        model.addAttribute("message","absence submitted succesfully");
//
//
//        return "prof/showForm";
//    }

    @RequestMapping(value = "serachEtudiant", method = RequestMethod.GET)
    public String serachPerson(@RequestParam String cne, Model model) {

        Utilisateur utl = etudiantService.getEtudiantByCNE(cne);
        if (utl==null) {

            model.addAttribute("errorMsg","no student found");
           // return "redirect:/prof/showHome";
        } else {

            PersonModel pm = new PersonModel();


                BeanUtils.copyProperties((Etudiant) utl, pm);
                pm.setTypePerson(PersonModel.TYPE_PROF);

            List<PersonModel> modelPersons = new ArrayList<PersonModel>();
            modelPersons.add(pm);
            model.addAttribute("personList", modelPersons);
        }
        return "prof/etudiantFiche";

    }

    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String AbsenceFiche(@RequestParam(value = "idInscription", required = false) Long idInscription, Model model){


            AbsenceModel absenceModel = new AbsenceModel(idInscription);
            model.addAttribute("absenceModel", absenceModel);

            // Nous avons choisit d'utiliser une classe modèle personnalisée
            // définie par PersonModel pour une meilleur flexibilité

            List<Absence> absences = absenceService.getEtudiantAbsenceByIdInscription(String.valueOf(idInscription));
            List<AbsenceModel> absenceModels = new ArrayList<AbsenceModel>();
            // On copie les données des personnes vers le modèle
            for (int i = 0; i < absences.size(); i++) {
                AbsenceModel pm = new AbsenceModel();
                if (absences.get(i) instanceof Absence) {
                    // permet de copier les données d'un objet à l'autre à codition
                    // d'avoir les meme attributs (getters/setters)
                    BeanUtils.copyProperties((Absence) absences.get(i), pm);
                    // On fixe le type (cet attribut ne sera pas copié automatiquement)
                    pm.setIdInscription(idInscription);

                    // Mettre la personne dans le modèle
                    absenceModels.add(pm);
                }
            }

            // Mettre la liste des personnes dans le modèle de Spring MVC
            model.addAttribute("absenceModel", absenceModel);

            return "prof/etudiantFiche";
        }

    @RequestMapping(value = "absenceHistory" , method =RequestMethod.GET )
    public String absenceHistory(@RequestParam Long idInscription , Model model){

        List<Absence> absencesList = absenceService.getEtudiantAbsenceByIdInscription(String.valueOf(idInscription));
        AbsenceModel AB = new AbsenceModel();



        for (Absence e : absencesList
             ) {
            System.out.println(absencesList);
        }


        model.addAttribute("absModel",absencesList);

        return "prof/absenceHistory";
    }


    @RequestMapping(value = "updateAbsence/{idAbsence}",method=RequestMethod.GET)
    public String updateAbsence(@PathVariable Long idAbsence,@ModelAttribute("absenceModel") AbsenceModel ab,Model model){


        Absence absence = absenceService.getAbsenceById(idAbsence);
//        absenceService.updateAbsence(absence,idAbsence,ab.getDateHeureFinAbsence());


        return "redirect:/prof/absenceHistory?idInscription=" + absence.getInscription().getIdInscription();
    }

    @RequestMapping(value = "setAbsence")
    public String createAbsence(@RequestParam Long idAbsence, @ModelAttribute("Absence") AbsenceModel absenceModel,  BindingResult bindingResult,
                                Model model) {
        AbsenceModel amodel = new AbsenceModel();
        UserAndAccountInfos infoUser = getUserAccount();
        Absence absence1 = new Absence();
        BeanUtils.copyProperties(absenceModel, absence1);

        absenceService.createAbsence(absence1);




        model.addAttribute("Absence",absenceService);
        model.addAttribute("idinscription", getUserAccount().getIdPersonne());






        return "prof/setAbsence";
    }



    }




