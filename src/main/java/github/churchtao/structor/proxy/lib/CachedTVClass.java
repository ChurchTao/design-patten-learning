package github.churchtao.structor.proxy.lib;

import github.churchtao.structor.proxy.bean.Video;
import github.churchtao.structor.proxy.cache.ListCache;
import github.churchtao.structor.proxy.cache.VideoCache;

import java.util.List;

public class CachedTVClass implements ThirdPartyTVLib{

    private ThirdPartyTVLib service;

    private ListCache listCache;
    private VideoCache videoCache;


    public CachedTVClass(ThirdPartyTVLib service) {
        this.service = service;
    }

    @Override
    public List<Video> listVideos() {
        // if listCache != null get from cache
        // else
        return service.listVideos();
    }

    @Override
    public Video getVideoInfo(int id) {
        return null;
    }

    @Override
    public void downloadVideo(int id) {

    }
}
