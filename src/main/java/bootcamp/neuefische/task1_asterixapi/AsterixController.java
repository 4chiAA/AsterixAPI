package bootcamp.neuefische.task1_asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asterix")
@RequiredArgsConstructor
public class AsterixController {

    private final AsterixService service;

    @GetMapping("/characters")
    public List<Character> getCharacters(){
        return service.getCharacters();
    }

    @PostMapping("/characters")
    public List<Character> saveCharacter(@RequestBody List<Character> character){
        return service.saveCharacter(character);
    }
}
