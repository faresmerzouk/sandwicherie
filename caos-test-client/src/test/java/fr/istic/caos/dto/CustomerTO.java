package fr.istic.caos.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerTO {
    /**
     * L'identifiant unique
     */
    public int id;

    /**
     * Le nom du client
     */
    public String c_name;

    /**
     * Le solde du compte client
     */
    public int credit;

    /**
     * Le mot de passe du client
     */
    public String password;
}
