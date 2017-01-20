package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;

import java.util.Set;

/**
 * Created by florian on 20/01/2017.
 * (c) Polarsteps
 */

public class CachingAlgorithmDecorator<T extends ClusterItem> extends PreCachingAlgorithmDecorator<T> {
    public CachingAlgorithmDecorator(Algorithm algorithm) {
        super(algorithm);
    }

    @Override
    public Set<? extends Cluster<T>> getClusters(double zoom) {
        int discreteZoom = (int) zoom;
        Set<? extends Cluster<T>> results = getClustersInternal(discreteZoom);
        return results;
    }
}
