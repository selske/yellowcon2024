package be.yellowcon.hexagonal.application.ports.in;

import be.yellowcon.hexagonal.domain.aggregate.DomainObject;

public interface UseCase {

    void create(DomainObject domainObject);

}
