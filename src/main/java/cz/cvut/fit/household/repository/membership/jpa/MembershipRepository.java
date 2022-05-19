package cz.cvut.fit.household.repository.membership.jpa;

import cz.cvut.fit.household.datamodel.entity.Membership;
import cz.cvut.fit.household.repository.membership.AbstractMembershipRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Contains a filter method, which is searching for members, in invitation procedure
 */
@Repository
public interface MembershipRepository extends MembershipCustomRepository, JpaRepository<Membership, Long> {

    /**
     * Searching for members with given name
     *
     * @param searchTerm is username of needed member
     * @return a list of the members, whose username is matched with given
     */
    @Query(value = "select m from Membership m where m.user.username like %?1%")
    List<Membership> findMembershipsByUsername(String searchTerm);
}
