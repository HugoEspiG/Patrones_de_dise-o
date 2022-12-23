package ModelProf;


public abstract class DecoratorProf implements IComponentProf {

    private IComponentProf profesor;

    public DecoratorProf(IComponentProf profesor) {
        this.profesor = profesor;
    }
    
    @Override
    public void operation(){
        profesor.operation();
    }

}
