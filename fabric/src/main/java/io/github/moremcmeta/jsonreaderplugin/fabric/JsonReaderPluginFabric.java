package io.github.moremcmeta.jsonreaderplugin.fabric;

import io.github.moremcmeta.jsonreaderplugin.ModConstants;
import io.github.soir20.moremcmeta.api.client.MoreMcmetaMetadataReaderPlugin;
import io.github.soir20.moremcmeta.api.client.metadata.MetadataReader;

public class JsonReaderPluginFabric implements MoreMcmetaMetadataReaderPlugin {

    @Override
    public String extension() {
        return ModConstants.EXTENSION;
    }

    @Override
    public MetadataReader metadataReader() {
        return ModConstants.READER;
    }

    @Override
    public String displayName() {
        return ModConstants.DISPLAY_NAME;
    }
}
