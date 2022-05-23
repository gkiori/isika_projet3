package fr.isika.cda15.projets.projet3.presentation.managedbean;

import fr.isika.cda15.projets.projet3.entity.Association;
import fr.isika.cda15.projets.projet3.service.association.AssociationService;
import fr.isika.cda15.projets.projet3.service.association.DefaultAssociationData;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean(name = "associations")
@ViewScoped
public class AssociationsBean {

    @Inject
    private AssociationService associationService;

    @Inject
    DefaultAssociationData defaultAssociationData;

    private List<Association> associationList;

    @PostConstruct
    public void init() {
        this.associationList = associationService.findAllService();
    }

    public List<Association> getAssociationList() {
        return associationList;
    }

    public void setAssociationList(List<Association> associationList) {
        this.associationList = associationList;
    }
}
