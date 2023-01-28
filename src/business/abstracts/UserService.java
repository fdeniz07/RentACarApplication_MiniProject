package business.abstracts;

import core.helpers.IdMaker;

public abstract class UserService implements IdMaker {

    public abstract void register();

    public abstract void add();
}
