package bootcamp.neuefische.task1_asterixapi;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IDService {

    public String randomId(){
        return UUID.randomUUID().toString();
    }
}
