package com.uet.example.api.record.dto;



@javax.annotation.processing.Generated("dsl_json")
public class _ErrorDTO_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.uet.example.api.record.dto.ErrorDTO.class, objectConverter);
		__dsljson.registerReader(com.uet.example.api.record.dto.ErrorDTO.class, objectConverter);
		__dsljson.registerWriter(com.uet.example.api.record.dto.ErrorDTO.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.uet.example.api.record.dto.ErrorDTO>, com.dslplatform.json.JsonReader.BindObject<com.uet.example.api.record.dto.ErrorDTO> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		private final com.dslplatform.json.JsonReader.ReadObject<java.lang.String> reader_errors;
		private final com.dslplatform.json.JsonWriter.WriteObject<java.lang.String> writer_errors;
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
			this.reader_errors = com.dslplatform.json.StringConverter.READER;
			this.writer_errors = com.dslplatform.json.StringConverter.WRITER;
		}
		public com.uet.example.api.record.dto.ErrorDTO read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.uet.example.api.record.dto.ErrorDTO());
		}
		private static final byte[] quoted_errors = "\"errors\":".getBytes(utf8);
		private static final byte[] name_errors = "errors".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.uet.example.api.record.dto.ErrorDTO instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.uet.example.api.record.dto.ErrorDTO instance) {
			writer.writeAscii(quoted_errors);
			if (instance.errors == null) writer.writeNull();
			else writer.serialize(instance.errors, writer_errors);
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.uet.example.api.record.dto.ErrorDTO instance) {
			boolean hasWritten = false;
			if (instance.errors != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_errors); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer.serialize(instance.errors, writer_errors);
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.uet.example.api.record.dto.ErrorDTO bind(final com.dslplatform.json.JsonReader reader, final com.uet.example.api.record.dto.ErrorDTO instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.uet.example.api.record.dto.ErrorDTO readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.uet.example.api.record.dto.ErrorDTO instance = new com.uet.example.api.record.dto.ErrorDTO();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.uet.example.api.record.dto.ErrorDTO instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 669 || !reader.wasLastName(name_errors)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.errors = reader.readCollection(reader_errors);
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 1);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.uet.example.api.record.dto.ErrorDTO instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case -99108218:
					reader.getNextToken();
					instance.errors = reader.readCollection(reader_errors);
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case -99108218:
						reader.getNextToken();
						instance.errors = reader.readCollection(reader_errors);
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
