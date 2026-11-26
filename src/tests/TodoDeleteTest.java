/* ************************************************************************** */
/*                                                                            */
/*                                                            +#              */
/*   TodoDeleteTest.java                                    +##               */
/*                                                         +###+              */
/*   By: lucas <lucas@tsiaraso.com>                      +########+           */
/*                                                           +###+            */
/*   Created: 2026/03/12 12:49:02 by lucas                   ##+              */
/*   Updated: 2026/11/26 14:00:37 by lucas                  #+                */
/*                                                                            */
/* ************************************************************************** */

package tests;

public class TodoDeleteTest {

    static void testDelete() {
        var uc = TodoUseCaseTest.makeUC();
        uc.create("bye");
        assert  uc.delete(1) : "delete ok";
        assert !uc.delete(1) : "second delete fails";
        System.out.println("PASS testDelete");
    }
}
