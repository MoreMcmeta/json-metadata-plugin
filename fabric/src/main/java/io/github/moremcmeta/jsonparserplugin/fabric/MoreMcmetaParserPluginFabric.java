/*
 * MoreMcmeta is a Minecraft mod expanding texture configuration capabilities.
 * Copyright (C) 2023 soir20
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

package io.github.moremcmeta.jsonparserplugin.fabric;

import io.github.moremcmeta.jsonparserplugin.ModConstants;
import io.github.moremcmeta.moremcmeta.api.client.MoreMcmetaMetadataParserPlugin;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataParser;

/**
 * Implementation of the JSON parser plugin on Fabric for the .moremcmeta extension.
 * @author soir20
 */
@SuppressWarnings("unused")
public final class MoreMcmetaParserPluginFabric implements MoreMcmetaMetadataParserPlugin {

    @Override
    public String extension() {
        return ModConstants.MOREMCMETA_EXTENSION;
    }

    @Override
    public MetadataParser metadataParser() {
        return ModConstants.PARSER;
    }

    @Override
    public String id() {
        return ModConstants.MOREMCMETA_EXT_PLUGIN_ID;
    }
}
