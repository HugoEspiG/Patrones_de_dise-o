/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LauncherCentral;

import java.util.ArrayList;

/**
 *
 * @author hugoa
 */
public class Logica {

    private Usuario usuario;
    private UsuarioAdmon Admon=  UsuarioAdmon.getSingletonInstance("Rector", "Rector123");
    ArrayList<Usuario> arr = new ArrayList<>();
    
    
    public Logica(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void agUser() {
        arr.add(usuario);
    }

    public boolean logAdmon() {
        if (usuario.getUsuario().equals(Admon.getUsuario())&&usuario.getContrasenia().equals(Admon.getContrasenia())) {
            return true;
        }
        return false;
    }

    public boolean logUser() {
        for (Usuario u : arr) {
            if (arr.contains(usuario)) {
                return true;
            }
        }
        return false;
    }

}
