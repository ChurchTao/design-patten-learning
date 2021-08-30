package github.churchtao.structor.proxy.lib;

import github.churchtao.structor.proxy.bean.Video;

import java.util.List;

public class ThirdPartyTVClass implements ThirdPartyTVLib{
    @Override
    public List<Video> listVideos() {
        return null;
    }

    @Override
    public Video getVideoInfo(int id) {
        return null;
    }

    @Override
    public void downloadVideo(int id) {

    }
}
