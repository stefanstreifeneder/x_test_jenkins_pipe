/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x_test_jenkins_pipe;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author stefan
 */
@Named(value = "jenkinsController")
@SessionScoped
public class JenkinsController  implements Serializable {
    
    private static final long serialVersionUID = 915049444977089806L;
    
    
        private String jenkinsText = "Hallo from The Bean";

    /**
     * Get the value of jenkinsText
     *
     * @return the value of jenkinsText
     */
    public String getJenkinsText() {
        System.out.println("JenkinsController, getJenkinsText: " + this.jenkinsText + " - " + new Date().toString());
        return jenkinsText;
    }

    /**
     * Set the value of jenkinsText
     *
     * @param jenkinsText new value of jenkinsText
     */
    public void setJenkinsText(String jenkinsText) {
        this.jenkinsText = jenkinsText;
    }

    
}
