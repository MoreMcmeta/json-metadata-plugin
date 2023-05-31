/*
 * JSON Parser Plugin is a plugin for MoreMcmeta that reads JSON metadata files.
 * Copyright (C) 2022 soir20
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moremcmeta.jsonreaderplugin.fabric;

import io.github.moremcmeta.jsonreaderplugin.ModConstants;
import io.github.moremcmeta.moremcmeta.api.client.MoreMcmetaMetadataParserPlugin;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataParser;

/**
 * Implementation of the JSON parser plugin on Fabric.
 * @author soir20
 */
@SuppressWarnings("unused")
public class JsonParserPluginFabric implements MoreMcmetaMetadataParserPlugin {

    @Override
    public String extension() {
        return ModConstants.EXTENSION;
    }

    @Override
    public MetadataParser metadataParser() {
        return ModConstants.PARSER;
    }

    @Override
    public String displayName() {
        return ModConstants.DISPLAY_NAME;
    }
}
