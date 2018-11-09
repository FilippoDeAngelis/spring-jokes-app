package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes cnq;

    public JokeServiceImpl(ChuckNorrisQuotes cnq) {
        this.cnq = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return cnq.getRandomQuote();
    }
}
