package hooks;

public interface SampleListener{

        public void serviceAdded(ServiceEvent event);
        public void serviceRemoved(ServiceEvent event) ;
        public void serviceResolved(ServiceEvent event) ;
    }