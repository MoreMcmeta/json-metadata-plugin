package io.github.moremcmeta.jsonreaderplugin;

import io.github.soir20.moremcmeta.api.client.metadata.MetadataReader;

public class ModConstants {
    public static final String MOD_ID = "moremcmeta_json_reader_plugin";
    public static final String DISPLAY_NAME = "MoreMcmeta JSON Metadata Reader";
    public static final MetadataReader READER = new JsonMetadataReader();
    public static final String EXTENSION = "moremcmeta";
}
