package umc.study.service.TempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.base.handler.TempHandler;


@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{
    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(Code.TEMP_EXCEPTION);
    }
}