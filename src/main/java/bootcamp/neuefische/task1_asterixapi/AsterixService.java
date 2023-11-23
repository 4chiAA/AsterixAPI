package bootcamp.neuefische.task1_asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AsterixService {

    private final CharacterRepo repo;

    public List<Character> saveCharacter(List<Character> character){
        return repo.saveAll(character);
    }

    public List<Character> getCharacters() {
        return repo.findAll();
    }
}
