package io.github.moremcmeta.jsonreaderplugin.forge;

import io.github.moremcmeta.jsonreaderplugin.ModConstants;
import io.github.soir20.moremcmeta.api.client.MoreMcmetaMetadataReaderPlugin;
import io.github.soir20.moremcmeta.api.client.metadata.MetadataReader;
import io.github.soir20.moremcmeta.forge.api.client.MoreMcmetaClientPlugin;

@MoreMcmetaClientPlugin
@SuppressWarnings("unused")
public class JsonReaderPluginForge implements MoreMcmetaMetadataReaderPlugin {

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
