package example.jpaproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    //상속으로 인한 수정방지
    protected Address() {
    }

    //Setter 대신 생성할때 생성자로 이용해 생성하는게 좋음
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
