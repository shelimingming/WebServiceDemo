import com.sheliming.ws.server.HelloWSImpl;
import com.sheliming.ws.server.HelloWSImplService;
import com.sheliming.ws.server.User;

import java.util.List;

public class WSClient {
    public static void main(String[] args) {
        HelloWSImplService factory = new HelloWSImplService();
        HelloWSImpl helloWSImplPort = factory.getHelloWSImplPort();

        String name = helloWSImplPort.hello("shelimng");
        System.out.println("name="+name);

        List<User> users = helloWSImplPort.getUsers();
        System.out.println(users);
    }
}
