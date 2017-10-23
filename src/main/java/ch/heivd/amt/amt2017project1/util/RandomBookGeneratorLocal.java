/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.util;

import javax.ejb.Local;

/**
 *
 * @author Ali Miladi
 */
@Local
public interface RandomBookGeneratorLocal {
    public String randomIsbn();

    public String randomName();

    public String randomAuthor();

    public String randomTheme();
    
    public int randomNbPages();
}
