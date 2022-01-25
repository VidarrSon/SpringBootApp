package train2middle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.info.GitProperties;
import org.springframework.web.bind.annotation.RestController;
import train2middle.controller.api.AppInfoApi;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AppInfoController implements AppInfoApi {

    private final GitProperties gitProperties;
    private final BuildProperties buildProperties;

    @Override
    public Map<String, String> getAppVersion() {
        Map<String, String> result = new HashMap<>();
        result.put("App version", buildProperties.getVersion() + "-" + gitProperties.getShortCommitId());
        return result;
    }
}
