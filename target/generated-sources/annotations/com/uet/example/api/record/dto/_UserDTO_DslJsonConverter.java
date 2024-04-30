package com.uet.example.api.record.dto;



@javax.annotation.processing.Generated("dsl_json")
public class _UserDTO_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.uet.example.api.record.dto.UserDTO.class, objectConverter);
		__dsljson.registerReader(com.uet.example.api.record.dto.UserDTO.class, objectConverter);
		__dsljson.registerWriter(com.uet.example.api.record.dto.UserDTO.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.uet.example.api.record.dto.UserDTO>, com.dslplatform.json.JsonReader.BindObject<com.uet.example.api.record.dto.UserDTO> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.uet.example.api.record.dto.UserDTO read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.uet.example.api.record.dto.UserDTO());
		}
		private static final byte[] quoted_age = "\"age\":".getBytes(utf8);
		private static final byte[] name_age = "age".getBytes(utf8);
		private static final byte[] quoted_id = ",\"id\":".getBytes(utf8);
		private static final byte[] name_id = "id".getBytes(utf8);
		private static final byte[] quoted_name = ",\"name\":".getBytes(utf8);
		private static final byte[] name_name = "name".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.uet.example.api.record.dto.UserDTO instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.uet.example.api.record.dto.UserDTO instance) {
			writer.writeAscii(quoted_age);
			com.dslplatform.json.NumberConverter.serialize(instance.age, writer);
			writer.writeAscii(quoted_id);
			com.dslplatform.json.NumberConverter.serialize(instance.id, writer);
			writer.writeAscii(quoted_name);
			if (instance.name == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.name, writer);
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.uet.example.api.record.dto.UserDTO instance) {
			boolean hasWritten = false;
			if (instance.age != 0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_age); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.age, writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.id != 0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_id); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.id, writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.name != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_name); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.name, writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.uet.example.api.record.dto.UserDTO bind(final com.dslplatform.json.JsonReader reader, final com.uet.example.api.record.dto.UserDTO instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.uet.example.api.record.dto.UserDTO readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.uet.example.api.record.dto.UserDTO instance = new com.uet.example.api.record.dto.UserDTO();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.uet.example.api.record.dto.UserDTO instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 301 || !reader.wasLastName(name_age)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.age = com.dslplatform.json.NumberConverter.deserializeInt(reader);
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 205 || !reader.wasLastName(name_id)) { bindSlow(reader, instance, 1); return; }
			reader.getNextToken();
			instance.id = com.dslplatform.json.NumberConverter.deserializeInt(reader);
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 417 || !reader.wasLastName(name_name)) { bindSlow(reader, instance, 2); return; }
			reader.getNextToken();
			instance.name = com.dslplatform.json.StringConverter.READER.read(reader);
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 3);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.uet.example.api.record.dto.UserDTO instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case -1925595674:
					reader.getNextToken();
					instance.name = com.dslplatform.json.StringConverter.READER.read(reader);
					reader.getNextToken();
					break;
				case 926444256:
					reader.getNextToken();
					instance.id = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					reader.getNextToken();
					break;
				case 742476188:
					reader.getNextToken();
					instance.age = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case -1925595674:
						reader.getNextToken();
						instance.name = com.dslplatform.json.StringConverter.READER.read(reader);
						reader.getNextToken();
						break;
					case 926444256:
						reader.getNextToken();
						instance.id = com.dslplatform.json.NumberConverter.deserializeInt(reader);
						reader.getNextToken();
						break;
					case 742476188:
						reader.getNextToken();
						instance.age = com.dslplatform.json.NumberConverter.deserializeInt(reader);
						reader.getNextToken();
						break;
					default:
						reader.getNextToken();
						reader.skip();
				}
			}
			if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
		}
	}
}
