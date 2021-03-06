/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicRole;
import Business.Role.Role;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author zhaoxiaohan
 */
public class ClinicOrganization extends Organization{
    private ArrayList<Inventory> inventoryList;
    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
        inventoryList = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    public Inventory addInventory(Inventory inventory){
        inventoryList.add(inventory);
        return inventory;
    }
    public Inventory searchInventory(Vaccine vaccine){
        for(Inventory in : inventoryList){
            if (in.getVaccine().equals(vaccine)) {
                return in;
            }
        }
        return null;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicRole());
        return roles;
    }
}
