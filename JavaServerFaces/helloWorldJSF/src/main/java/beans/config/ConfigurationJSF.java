package beans.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

@FacesConfig(
        //Activa CDI build-in beans
        version = FacesConfig.Version.JSF_2_3
)
@ApplicationScoped
public class ConfigurationJSF {

}
