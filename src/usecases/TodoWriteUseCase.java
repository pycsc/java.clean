/* ************************************************************************** */
/*                                                                            */
/*                                                           +#               */
/*    TodoWriteUseCase.java                                 +##               */
/*                                                        +###+               */
/*    By: lucas <lucas@tsiaraso.com>                   +########+             */
/*                                                         +###+              */
/*    Created: 2026/03/12 12:36:56 by lucas                  ##+              */
/*    Updated: 2026/03/12 12:36:56 by lucas                  #+               */
/*                                                                            */
/* ************************************************************************** */

package usecases;

import entities.Todo;
import interfaces.TodoRepository;
import java.util.Optional;

public class TodoWriteUseCase extends TodoUseCase {

    public TodoWriteUseCase(TodoRepository repo) { super(repo); }

    public Optional<Todo> update(int id, String t, boolean done) {
        return repo.update(id, t, done);
    }

    public boolean delete(int id) { return repo.delete(id); }
}
