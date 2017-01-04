/*
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.options;

// This file is automatically generated by options.yml with 'jt build options'

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;

import javax.annotation.Generated;

@Generated("tool/truffle/generate-options.rb")
public class Options {

    public final String HOME;
    @CompilationFinal(dimensions=1) public final String[] LOAD_PATHS;
    @CompilationFinal(dimensions=1) public final String[] REQUIRED_LIBRARIES;
    @CompilationFinal(dimensions=1) public final byte[] INLINE_SCRIPT;
    @CompilationFinal(dimensions=1) public final String[] ARGUMENTS;
    public final String DISPLAYED_FILE_NAME;
    public final boolean DEBUG;
    public final Verbosity VERBOSITY;
    public final boolean FROZEN_STRING_LITERALS;
    public final boolean DISABLE_GEMS;
    public final String INTERNAL_ENCODING;
    public final String EXTERNAL_ENCODING;
    public final boolean PLATFORM_SAFE;
    public final boolean PLATFORM_SAFE_LOAD;
    public final boolean PLATFORM_SAFE_IO;
    public final boolean PLATFORM_SAFE_MEMORY;
    public final boolean PLATFORM_SAFE_THREADS;
    public final boolean PLATFORM_SAFE_PROCESSES;
    public final boolean PLATFORM_SAFE_SIGNALS;
    public final boolean PLATFORM_SAFE_EXIT;
    public final boolean PLATFORM_SAFE_AT_EXIT;
    public final boolean PLATFORM_SAFE_PUTS;
    public final boolean PLATFORM_USE_JAVA;
    public final boolean TRACE_CALLS;
    public final boolean COVERAGE_GLOBAL;
    public final boolean INLINE_JS;
    public final String CORE_LOAD_PATH;
    public final boolean CORE_PARALLEL_LOAD;
    public final boolean LAZY_TRANSLATION;
    public final int ARRAY_UNINITIALIZED_SIZE;
    public final int ARRAY_SMALL;
    public final int HASH_PACKED_ARRAY_MAX;
    public final boolean ROPE_LAZY_SUBSTRINGS;
    public final boolean ROPE_PRINT_INTERN_STATS;
    public final int ROPE_DEPTH_THRESHOLD;
    public final int GLOBAL_VARIABLE_MAX_INVALIDATIONS;
    public final int DEFAULT_CACHE;
    public final int METHOD_LOOKUP_CACHE;
    public final int DISPATCH_CACHE;
    public final int YIELD_CACHE;
    public final int METHOD_TO_PROC_CACHE;
    public final int IS_A_CACHE;
    public final int BIND_CACHE;
    public final int CONSTANT_CACHE;
    public final int INSTANCE_VARIABLE_CACHE;
    public final int BINDING_LOCAL_VARIABLE_CACHE;
    public final int SYMBOL_TO_PROC_CACHE;
    public final int ALLOCATE_CLASS_CACHE;
    public final int PACK_CACHE;
    public final int UNPACK_CACHE;
    public final int EVAL_CACHE;
    public final int CLASS_CACHE;
    public final int ENCODING_COMPATIBLE_QUERY_CACHE;
    public final int ENCODING_LOADED_CLASSES_CACHE;
    public final int THREAD_CACHE;
    public final int ROPE_CLASS_CACHE;
    public final int INTEROP_CONVERT_CACHE;
    public final int INTEROP_EXECUTE_CACHE;
    public final int INTEROP_READ_CACHE;
    public final int INTEROP_WRITE_CACHE;
    public final int INTEROP_INVOKE_CACHE;
    public final boolean CLONE_DEFAULT;
    public final boolean INLINE_DEFAULT;
    public final boolean CORE_ALWAYS_CLONE;
    public final boolean INLINE_NEEDS_CALLER_FRAME;
    public final boolean YIELD_ALWAYS_CLONE;
    public final boolean YIELD_ALWAYS_INLINE;
    public final boolean METHODMISSING_ALWAYS_CLONE;
    public final boolean METHODMISSING_ALWAYS_INLINE;
    public final int PACK_UNROLL_LIMIT;
    public final int PACK_RECOVER_LOOP_MIN;
    public final int INSTRUMENTATION_SERVER_PORT;
    public final boolean EXCEPTIONS_STORE_JAVA;
    public final boolean EXCEPTIONS_PRINT_JAVA;
    public final boolean EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
    public final boolean EXCEPTIONS_TRANSLATE_ASSERT;
    public final boolean BACKTRACES_HIDE_CORE_FILES;
    public final boolean BACKTRACES_INTERLEAVE_JAVA;
    public final int BACKTRACES_LIMIT;
    public final boolean BACKTRACES_OMIT_UNUSED;
    public final boolean BASICOPS_INLINE;
    public final boolean METRICS_TIME;
    public final boolean METRICS_MEMORY_USED_ON_EXIT;
    public final boolean CALL_GRAPH;
    public final String CALL_GRAPH_WRITE;
    public final boolean CHAOS;
    public final boolean GRAAL_WARNING_UNLESS;
    public final boolean SHARED_OBJECTS_ENABLED;
    public final boolean SHARED_OBJECTS_DEBUG;
    public final boolean SHARED_OBJECTS_FORCE;
    public final boolean SHARED_OBJECTS_SHARE_ALL;
    public final boolean CEXTS_LOG_LOAD;
    public final boolean LOG_DYNAMIC_CONSTANT_LOOKUP;
    
    Options(OptionsBuilder builder) {
        HOME = builder.getOrDefault(OptionsCatalog.HOME);
        LOAD_PATHS = builder.getOrDefault(OptionsCatalog.LOAD_PATHS);
        REQUIRED_LIBRARIES = builder.getOrDefault(OptionsCatalog.REQUIRED_LIBRARIES);
        INLINE_SCRIPT = builder.getOrDefault(OptionsCatalog.INLINE_SCRIPT);
        ARGUMENTS = builder.getOrDefault(OptionsCatalog.ARGUMENTS);
        DISPLAYED_FILE_NAME = builder.getOrDefault(OptionsCatalog.DISPLAYED_FILE_NAME);
        DEBUG = builder.getOrDefault(OptionsCatalog.DEBUG);
        VERBOSITY = builder.getOrDefault(OptionsCatalog.VERBOSITY, Verbosity.FALSE);
        FROZEN_STRING_LITERALS = builder.getOrDefault(OptionsCatalog.FROZEN_STRING_LITERALS);
        DISABLE_GEMS = builder.getOrDefault(OptionsCatalog.DISABLE_GEMS);
        INTERNAL_ENCODING = builder.getOrDefault(OptionsCatalog.INTERNAL_ENCODING);
        EXTERNAL_ENCODING = builder.getOrDefault(OptionsCatalog.EXTERNAL_ENCODING);
        PLATFORM_SAFE = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE);
        PLATFORM_SAFE_LOAD = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_LOAD, PLATFORM_SAFE);
        PLATFORM_SAFE_IO = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_IO, PLATFORM_SAFE);
        PLATFORM_SAFE_MEMORY = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_MEMORY, PLATFORM_SAFE);
        PLATFORM_SAFE_THREADS = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_THREADS, PLATFORM_SAFE);
        PLATFORM_SAFE_PROCESSES = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_PROCESSES, PLATFORM_SAFE);
        PLATFORM_SAFE_SIGNALS = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_SIGNALS, PLATFORM_SAFE);
        PLATFORM_SAFE_EXIT = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_EXIT, PLATFORM_SAFE);
        PLATFORM_SAFE_AT_EXIT = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_AT_EXIT, PLATFORM_SAFE);
        PLATFORM_SAFE_PUTS = builder.getOrDefault(OptionsCatalog.PLATFORM_SAFE_PUTS);
        PLATFORM_USE_JAVA = builder.getOrDefault(OptionsCatalog.PLATFORM_USE_JAVA);
        TRACE_CALLS = builder.getOrDefault(OptionsCatalog.TRACE_CALLS);
        COVERAGE_GLOBAL = builder.getOrDefault(OptionsCatalog.COVERAGE_GLOBAL);
        INLINE_JS = builder.getOrDefault(OptionsCatalog.INLINE_JS);
        CORE_LOAD_PATH = builder.getOrDefault(OptionsCatalog.CORE_LOAD_PATH);
        CORE_PARALLEL_LOAD = builder.getOrDefault(OptionsCatalog.CORE_PARALLEL_LOAD);
        LAZY_TRANSLATION = builder.getOrDefault(OptionsCatalog.LAZY_TRANSLATION);
        ARRAY_UNINITIALIZED_SIZE = builder.getOrDefault(OptionsCatalog.ARRAY_UNINITIALIZED_SIZE);
        ARRAY_SMALL = builder.getOrDefault(OptionsCatalog.ARRAY_SMALL);
        HASH_PACKED_ARRAY_MAX = builder.getOrDefault(OptionsCatalog.HASH_PACKED_ARRAY_MAX);
        ROPE_LAZY_SUBSTRINGS = builder.getOrDefault(OptionsCatalog.ROPE_LAZY_SUBSTRINGS);
        ROPE_PRINT_INTERN_STATS = builder.getOrDefault(OptionsCatalog.ROPE_PRINT_INTERN_STATS);
        ROPE_DEPTH_THRESHOLD = builder.getOrDefault(OptionsCatalog.ROPE_DEPTH_THRESHOLD);
        GLOBAL_VARIABLE_MAX_INVALIDATIONS = builder.getOrDefault(OptionsCatalog.GLOBAL_VARIABLE_MAX_INVALIDATIONS);
        DEFAULT_CACHE = builder.getOrDefault(OptionsCatalog.DEFAULT_CACHE);
        METHOD_LOOKUP_CACHE = builder.getOrDefault(OptionsCatalog.METHOD_LOOKUP_CACHE, DEFAULT_CACHE);
        DISPATCH_CACHE = builder.getOrDefault(OptionsCatalog.DISPATCH_CACHE, DEFAULT_CACHE);
        YIELD_CACHE = builder.getOrDefault(OptionsCatalog.YIELD_CACHE, DEFAULT_CACHE);
        METHOD_TO_PROC_CACHE = builder.getOrDefault(OptionsCatalog.METHOD_TO_PROC_CACHE, DEFAULT_CACHE);
        IS_A_CACHE = builder.getOrDefault(OptionsCatalog.IS_A_CACHE, DEFAULT_CACHE);
        BIND_CACHE = builder.getOrDefault(OptionsCatalog.BIND_CACHE, DEFAULT_CACHE);
        CONSTANT_CACHE = builder.getOrDefault(OptionsCatalog.CONSTANT_CACHE, DEFAULT_CACHE);
        INSTANCE_VARIABLE_CACHE = builder.getOrDefault(OptionsCatalog.INSTANCE_VARIABLE_CACHE, DEFAULT_CACHE);
        BINDING_LOCAL_VARIABLE_CACHE = builder.getOrDefault(OptionsCatalog.BINDING_LOCAL_VARIABLE_CACHE, DEFAULT_CACHE);
        SYMBOL_TO_PROC_CACHE = builder.getOrDefault(OptionsCatalog.SYMBOL_TO_PROC_CACHE, DEFAULT_CACHE);
        ALLOCATE_CLASS_CACHE = builder.getOrDefault(OptionsCatalog.ALLOCATE_CLASS_CACHE, DEFAULT_CACHE);
        PACK_CACHE = builder.getOrDefault(OptionsCatalog.PACK_CACHE, DEFAULT_CACHE);
        UNPACK_CACHE = builder.getOrDefault(OptionsCatalog.UNPACK_CACHE, DEFAULT_CACHE);
        EVAL_CACHE = builder.getOrDefault(OptionsCatalog.EVAL_CACHE, DEFAULT_CACHE);
        CLASS_CACHE = builder.getOrDefault(OptionsCatalog.CLASS_CACHE, DEFAULT_CACHE);
        ENCODING_COMPATIBLE_QUERY_CACHE = builder.getOrDefault(OptionsCatalog.ENCODING_COMPATIBLE_QUERY_CACHE, DEFAULT_CACHE);
        ENCODING_LOADED_CLASSES_CACHE = builder.getOrDefault(OptionsCatalog.ENCODING_LOADED_CLASSES_CACHE, DEFAULT_CACHE);
        THREAD_CACHE = builder.getOrDefault(OptionsCatalog.THREAD_CACHE, DEFAULT_CACHE);
        ROPE_CLASS_CACHE = builder.getOrDefault(OptionsCatalog.ROPE_CLASS_CACHE);
        INTEROP_CONVERT_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_CONVERT_CACHE, DEFAULT_CACHE);
        INTEROP_EXECUTE_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_EXECUTE_CACHE, DEFAULT_CACHE);
        INTEROP_READ_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_READ_CACHE, DEFAULT_CACHE);
        INTEROP_WRITE_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_WRITE_CACHE, DEFAULT_CACHE);
        INTEROP_INVOKE_CACHE = builder.getOrDefault(OptionsCatalog.INTEROP_INVOKE_CACHE, DEFAULT_CACHE);
        CLONE_DEFAULT = builder.getOrDefault(OptionsCatalog.CLONE_DEFAULT);
        INLINE_DEFAULT = builder.getOrDefault(OptionsCatalog.INLINE_DEFAULT);
        CORE_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.CORE_ALWAYS_CLONE, CLONE_DEFAULT);
        INLINE_NEEDS_CALLER_FRAME = builder.getOrDefault(OptionsCatalog.INLINE_NEEDS_CALLER_FRAME, INLINE_DEFAULT);
        YIELD_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.YIELD_ALWAYS_CLONE, CLONE_DEFAULT);
        YIELD_ALWAYS_INLINE = builder.getOrDefault(OptionsCatalog.YIELD_ALWAYS_INLINE, INLINE_DEFAULT);
        METHODMISSING_ALWAYS_CLONE = builder.getOrDefault(OptionsCatalog.METHODMISSING_ALWAYS_CLONE, CLONE_DEFAULT);
        METHODMISSING_ALWAYS_INLINE = builder.getOrDefault(OptionsCatalog.METHODMISSING_ALWAYS_INLINE, INLINE_DEFAULT);
        PACK_UNROLL_LIMIT = builder.getOrDefault(OptionsCatalog.PACK_UNROLL_LIMIT);
        PACK_RECOVER_LOOP_MIN = builder.getOrDefault(OptionsCatalog.PACK_RECOVER_LOOP_MIN);
        INSTRUMENTATION_SERVER_PORT = builder.getOrDefault(OptionsCatalog.INSTRUMENTATION_SERVER_PORT);
        EXCEPTIONS_STORE_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_STORE_JAVA);
        EXCEPTIONS_PRINT_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_PRINT_JAVA);
        EXCEPTIONS_PRINT_UNCAUGHT_JAVA = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_PRINT_UNCAUGHT_JAVA);
        EXCEPTIONS_TRANSLATE_ASSERT = builder.getOrDefault(OptionsCatalog.EXCEPTIONS_TRANSLATE_ASSERT);
        BACKTRACES_HIDE_CORE_FILES = builder.getOrDefault(OptionsCatalog.BACKTRACES_HIDE_CORE_FILES);
        BACKTRACES_INTERLEAVE_JAVA = builder.getOrDefault(OptionsCatalog.BACKTRACES_INTERLEAVE_JAVA);
        BACKTRACES_LIMIT = builder.getOrDefault(OptionsCatalog.BACKTRACES_LIMIT);
        BACKTRACES_OMIT_UNUSED = builder.getOrDefault(OptionsCatalog.BACKTRACES_OMIT_UNUSED);
        BASICOPS_INLINE = builder.getOrDefault(OptionsCatalog.BASICOPS_INLINE);
        METRICS_TIME = builder.getOrDefault(OptionsCatalog.METRICS_TIME);
        METRICS_MEMORY_USED_ON_EXIT = builder.getOrDefault(OptionsCatalog.METRICS_MEMORY_USED_ON_EXIT);
        CALL_GRAPH = builder.getOrDefault(OptionsCatalog.CALL_GRAPH);
        CALL_GRAPH_WRITE = builder.getOrDefault(OptionsCatalog.CALL_GRAPH_WRITE);
        CHAOS = builder.getOrDefault(OptionsCatalog.CHAOS);
        GRAAL_WARNING_UNLESS = builder.getOrDefault(OptionsCatalog.GRAAL_WARNING_UNLESS);
        SHARED_OBJECTS_ENABLED = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_ENABLED);
        SHARED_OBJECTS_DEBUG = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_DEBUG);
        SHARED_OBJECTS_FORCE = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_FORCE);
        SHARED_OBJECTS_SHARE_ALL = builder.getOrDefault(OptionsCatalog.SHARED_OBJECTS_SHARE_ALL);
        CEXTS_LOG_LOAD = builder.getOrDefault(OptionsCatalog.CEXTS_LOG_LOAD);
        LOG_DYNAMIC_CONSTANT_LOOKUP = builder.getOrDefault(OptionsCatalog.LOG_DYNAMIC_CONSTANT_LOOKUP);
    }

    public Object fromDescription(OptionDescription description) {
        switch (description.getName()) {
            case "home":
                return HOME;
            case "load_paths":
                return LOAD_PATHS;
            case "required_libraries":
                return REQUIRED_LIBRARIES;
            case "inline_script":
                return INLINE_SCRIPT;
            case "arguments":
                return ARGUMENTS;
            case "displayed_file_name":
                return DISPLAYED_FILE_NAME;
            case "debug":
                return DEBUG;
            case "verbosity":
                return VERBOSITY;
            case "frozen_string_literals":
                return FROZEN_STRING_LITERALS;
            case "disable_gems":
                return DISABLE_GEMS;
            case "internal_encoding":
                return INTERNAL_ENCODING;
            case "external_encoding":
                return EXTERNAL_ENCODING;
            case "platform.safe":
                return PLATFORM_SAFE;
            case "platform.safe.load":
                return PLATFORM_SAFE_LOAD;
            case "platform.safe.io":
                return PLATFORM_SAFE_IO;
            case "platform.safe.memory":
                return PLATFORM_SAFE_MEMORY;
            case "platform.safe.threads":
                return PLATFORM_SAFE_THREADS;
            case "platform.safe.processes":
                return PLATFORM_SAFE_PROCESSES;
            case "platform.safe.siganls":
                return PLATFORM_SAFE_SIGNALS;
            case "platform.safe.exit":
                return PLATFORM_SAFE_EXIT;
            case "platform.safe.at_exit":
                return PLATFORM_SAFE_AT_EXIT;
            case "platform.safe_puts":
                return PLATFORM_SAFE_PUTS;
            case "platform.use_java":
                return PLATFORM_USE_JAVA;
            case "trace.calls":
                return TRACE_CALLS;
            case "coverage.global":
                return COVERAGE_GLOBAL;
            case "inline_js":
                return INLINE_JS;
            case "core.load_path":
                return CORE_LOAD_PATH;
            case "core.parallel_load":
                return CORE_PARALLEL_LOAD;
            case "lazy_translation":
                return LAZY_TRANSLATION;
            case "array.uninitialized_size":
                return ARRAY_UNINITIALIZED_SIZE;
            case "array.small":
                return ARRAY_SMALL;
            case "hash.packed_array.max":
                return HASH_PACKED_ARRAY_MAX;
            case "rope.lazy_substrings":
                return ROPE_LAZY_SUBSTRINGS;
            case "rope.print_intern_stats":
                return ROPE_PRINT_INTERN_STATS;
            case "rope.depth_threshold":
                return ROPE_DEPTH_THRESHOLD;
            case "global_variable.max_invalidations":
                return GLOBAL_VARIABLE_MAX_INVALIDATIONS;
            case "default_cache":
                return DEFAULT_CACHE;
            case "method_lookup.cache":
                return METHOD_LOOKUP_CACHE;
            case "dispatch.cache":
                return DISPATCH_CACHE;
            case "yield.cache":
                return YIELD_CACHE;
            case "to_proc.cache":
                return METHOD_TO_PROC_CACHE;
            case "is_a.cache":
                return IS_A_CACHE;
            case "bind.cache":
                return BIND_CACHE;
            case "constant.cache":
                return CONSTANT_CACHE;
            case "instance_variable.cache":
                return INSTANCE_VARIABLE_CACHE;
            case "binding_local_variable.cache":
                return BINDING_LOCAL_VARIABLE_CACHE;
            case "symbol_to_proc.cache":
                return SYMBOL_TO_PROC_CACHE;
            case "allocate_class.cache":
                return ALLOCATE_CLASS_CACHE;
            case "pack.cache":
                return PACK_CACHE;
            case "unpack.cache":
                return UNPACK_CACHE;
            case "eval.cache":
                return EVAL_CACHE;
            case "class.cache":
                return CLASS_CACHE;
            case "encoding_compatible_query.cache":
                return ENCODING_COMPATIBLE_QUERY_CACHE;
            case "encoding_loaded_classes.cache":
                return ENCODING_LOADED_CLASSES_CACHE;
            case "thread.cache":
                return THREAD_CACHE;
            case "rope_class.cache":
                return ROPE_CLASS_CACHE;
            case "interop.convert.cache":
                return INTEROP_CONVERT_CACHE;
            case "interop.execute.cache":
                return INTEROP_EXECUTE_CACHE;
            case "interop.read.cache":
                return INTEROP_READ_CACHE;
            case "interop.write.cache":
                return INTEROP_WRITE_CACHE;
            case "interop.invoke.cache":
                return INTEROP_INVOKE_CACHE;
            case "clone.default":
                return CLONE_DEFAULT;
            case "inline.default":
                return INLINE_DEFAULT;
            case "core.always_clone":
                return CORE_ALWAYS_CLONE;
            case "inline_needs_caller_frame":
                return INLINE_NEEDS_CALLER_FRAME;
            case "yield.always_clone":
                return YIELD_ALWAYS_CLONE;
            case "yield.always_inline":
                return YIELD_ALWAYS_INLINE;
            case "method_missing.always_clone":
                return METHODMISSING_ALWAYS_CLONE;
            case "method_missing.always_inline":
                return METHODMISSING_ALWAYS_INLINE;
            case "pack.unroll":
                return PACK_UNROLL_LIMIT;
            case "pack.recover":
                return PACK_RECOVER_LOOP_MIN;
            case "instrumentation_server_port":
                return INSTRUMENTATION_SERVER_PORT;
            case "exceptions.store_java":
                return EXCEPTIONS_STORE_JAVA;
            case "exceptions.print_java":
                return EXCEPTIONS_PRINT_JAVA;
            case "exceptions.print_uncaught_java":
                return EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
            case "exceptions.translate_assert":
                return EXCEPTIONS_TRANSLATE_ASSERT;
            case "backtraces.hide_core_files":
                return BACKTRACES_HIDE_CORE_FILES;
            case "backtraces.interleave_java":
                return BACKTRACES_INTERLEAVE_JAVA;
            case "backtraces.limit":
                return BACKTRACES_LIMIT;
            case "backtraces.omit_unused":
                return BACKTRACES_OMIT_UNUSED;
            case "basic_ops.inline":
                return BASICOPS_INLINE;
            case "metrics.time":
                return METRICS_TIME;
            case "metrics.memory_used_on_exit":
                return METRICS_MEMORY_USED_ON_EXIT;
            case "callgraph":
                return CALL_GRAPH;
            case "callgraph.write":
                return CALL_GRAPH_WRITE;
            case "chaos":
                return CHAOS;
            case "graal.warn_unless":
                return GRAAL_WARNING_UNLESS;
            case "shared.objects":
                return SHARED_OBJECTS_ENABLED;
            case "shared.objects.debug":
                return SHARED_OBJECTS_DEBUG;
            case "shared.objects.force":
                return SHARED_OBJECTS_FORCE;
            case "shared.objects.share_all":
                return SHARED_OBJECTS_SHARE_ALL;
            case "cexts.log.load":
                return CEXTS_LOG_LOAD;
            case "constant.dynamic_lookup.log":
                return LOG_DYNAMIC_CONSTANT_LOOKUP;
            default:
                return null;
        }
    }
}
