/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Interface.EnterpriseRole.AgentWorkAreaJPanel;
import Interface.ServiceRole.ServiceWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Chance
 */
public class AgentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, Business business) {
        return new AgentWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
}
    