package provider.serviceimpl;

import com.service.DemoService;

public class DemoServiceImpl implements DemoService {

    public String demoService(String word) {
        return "hello buddbo provider"+word;
    }
}
