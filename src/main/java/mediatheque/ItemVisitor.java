/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author midor
 */
public interface ItemVisitor {

    public void visitCD(CD cd);

    public void visitBook(Book b);
}
