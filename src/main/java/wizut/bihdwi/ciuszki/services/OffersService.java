package wizut.bihdwi.ciuszki.services;

import org.springframework.stereotype.Service;
import wizut.bihdwi.ciuszki.jpa.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OffersService {
    @PersistenceContext
    private EntityManager em;
    private int numberOfOffers;

    public ItemManufacturer getItemManufacturer(int id) {
        return em.find(ItemManufacturer.class, id);
    }

    public List<ItemManufacturer> getItemManufacturers() {
        String jpql = "select im from ItemManufacturer im order by im.name";
        TypedQuery<ItemManufacturer> query = em.createQuery(jpql, ItemManufacturer.class);
        List<ItemManufacturer> result = query.getResultList();
        return result;
    }

    public ItemModel getModel(int id) {
        return em.find(ItemModel.class, id);
    }

    public List<ItemModel> getItemModels() {
        return em.createQuery("select itemModel from ItemModel itemModel order by itemModel.id", ItemModel.class).getResultList();
    }

    public List<SizingType> getSizingTypes() {
        return em.createQuery("select sizingType from SizingType sizingType order by sizingType.id", SizingType.class).getResultList();
    }
    public List<SizingTypeShoe> getShoeSizingTypes() {
        return em.createQuery("select sizingTypeShoe from SizingTypeShoe sizingTypeShoe order by sizingTypeShoe.id", SizingTypeShoe.class).getResultList();
    }

    public Offer getOffer(int id) {
        return em.find(Offer.class, id);
    }

    public List<Offer> getOffers() {
        String jpql = "select ofr from Offer ofr order by ofr.id";
        TypedQuery<Offer> query = em.createQuery(jpql, Offer.class);
        return query.getResultList();
    }

    public List<Offer> getOffersByModel(int modelId) {
        String jpql = "select ofr from Offer ofr where ofr.model.id = :id order by ofr.id";
        TypedQuery<Offer> query = em.createQuery(jpql, Offer.class);
        query.setParameter("id", modelId);
        return query.getResultList();
    }

    public List<Offer> getOffersByManufacturer(int manufacturerId) {
        String jpql = "select ofr from Offer ofr where ofr.manufacturer.id = :id order by ofr.id";
        TypedQuery<Offer> query = em.createQuery(jpql, Offer.class);
        query.setParameter("id", manufacturerId);
        return query.getResultList();
    }


    public Offer createOffer(Offer offer) {
        em.persist(offer);
        return offer;
    }

    public Offer deleteOffer(Integer id) {
        Offer offer = em.find(Offer.class, id);
        em.remove(offer);
        return offer;
    }

    public Offer saveOffer(Offer offer) {
        return em.merge(offer);
    }
}
