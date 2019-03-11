package org.springframework.samples.petclinic.owner;

import lombok.extern.slf4j.Slf4j;
import java.util.Collection;

import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public void saveOwner(Owner owner) {
        ownerRepository.save(owner);
        log.info("owner is saved : " + owner);
    }

    public Collection<Owner> findOwnerByLastName(String lastName) {
        final Collection<Owner> byLastName = ownerRepository.findByLastName(lastName);
        log.info("owners found");
        return byLastName;
    }

}
