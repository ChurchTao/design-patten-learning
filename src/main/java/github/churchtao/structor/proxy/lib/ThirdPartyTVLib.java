package github.churchtao.structor.proxy.lib;

import github.churchtao.structor.proxy.bean.Video;

import java.util.List;

public interface ThirdPartyTVLib {


    List<Video> listVideos();

    Video getVideoInfo(int id);

    void downloadVideo(int id);
}
