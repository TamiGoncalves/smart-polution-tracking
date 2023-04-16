package hooks;
import javax.jmdns.ServiceEvent;

public interface ServiceDiscoListener {

        public void serviceAdded(ServiceEvent event);
        public void serviceRemoved(ServiceEvent event) ;
        public void serviceResolved(ServiceEvent event) ;
    }