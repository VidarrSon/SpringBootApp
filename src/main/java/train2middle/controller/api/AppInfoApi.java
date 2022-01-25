package train2middle.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/info")
public interface AppInfoApi {

    @RequestMapping("/version")
    Map<String, String> getAppVersion();
}
