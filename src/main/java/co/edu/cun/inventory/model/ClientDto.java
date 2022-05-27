package co.edu.cun.inventory.model;

import co.edu.cun.inventory.model.enums.DocumentType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {

    private Integer id;

    private DocumentType documentType;

    private String documentNumber;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;

}
