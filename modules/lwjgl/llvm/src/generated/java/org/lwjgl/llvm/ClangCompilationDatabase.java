/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ClangCompilationDatabase {

    /**
     * Error codes for Compilation Database
     * 
     * <p>({@code CXCompilationDatabase_Error})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCompilationDatabase_NoError CompilationDatabase_NoError} - No error occurred</li>
     * <li>{@link #CXCompilationDatabase_CanNotLoadDatabase CompilationDatabase_CanNotLoadDatabase} - Database can not be loaded</li>
     * </ul>
     */
    public static final int
        CXCompilationDatabase_NoError            = 0,
        CXCompilationDatabase_CanNotLoadDatabase = 1;

    static { LibLLVM.initialize(); }

    protected ClangCompilationDatabase() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code ClangIndex.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompilationDatabase_fromDirectory         = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_fromDirectory"),
            CompilationDatabase_dispose               = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_dispose"),
            CompilationDatabase_getCompileCommands    = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_getCompileCommands"),
            CompilationDatabase_getAllCompileCommands = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_getAllCompileCommands"),
            CompileCommands_dispose                   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommands_dispose"),
            CompileCommands_getSize                   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommands_getSize"),
            CompileCommands_getCommand                = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommands_getCommand"),
            CompileCommand_getDirectory               = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getDirectory"),
            CompileCommand_getFilename                = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getFilename"),
            CompileCommand_getNumArgs                 = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getNumArgs"),
            CompileCommand_getArg                     = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getArg"),
            CompileCommand_getNumMappedSources        = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getNumMappedSources"),
            CompileCommand_getMappedSourcePath        = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getMappedSourcePath"),
            CompileCommand_getMappedSourceContent     = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getMappedSourceContent");

    }

    // --- [ clang_CompilationDatabase_fromDirectory ] ---

    /** Unsafe version of: {@link #clang_CompilationDatabase_fromDirectory CompilationDatabase_fromDirectory} */
    public static long nclang_CompilationDatabase_fromDirectory(long BuildDir, long ErrorCode) {
        long __functionAddress = Functions.CompilationDatabase_fromDirectory;
        return invokePPP(__functionAddress, BuildDir, ErrorCode);
    }

    /**
     * Creates a compilation database from the database found in directory buildDir. For example, CMake can output a compile_commands.json which can be used
     * to build the database.
     * 
     * <p>It must be freed by {@code clang_CompilationDatabase_dispose}.</p>
     */
    @NativeType("CXCompilationDatabase")
    public static long clang_CompilationDatabase_fromDirectory(@NativeType("char const *") ByteBuffer BuildDir, @NativeType("CXCompilationDatabase_Error *") IntBuffer ErrorCode) {
        if (CHECKS) {
            checkNT1(BuildDir);
            check(ErrorCode, 1);
        }
        return nclang_CompilationDatabase_fromDirectory(memAddress(BuildDir), memAddress(ErrorCode));
    }

    /**
     * Creates a compilation database from the database found in directory buildDir. For example, CMake can output a compile_commands.json which can be used
     * to build the database.
     * 
     * <p>It must be freed by {@code clang_CompilationDatabase_dispose}.</p>
     */
    @NativeType("CXCompilationDatabase")
    public static long clang_CompilationDatabase_fromDirectory(@NativeType("char const *") CharSequence BuildDir, @NativeType("CXCompilationDatabase_Error *") IntBuffer ErrorCode) {
        if (CHECKS) {
            check(ErrorCode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer BuildDirEncoded = stack.ASCII(BuildDir);
            return nclang_CompilationDatabase_fromDirectory(memAddress(BuildDirEncoded), memAddress(ErrorCode));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_CompilationDatabase_dispose ] ---

    /** Free the given compilation database */
    public static void clang_CompilationDatabase_dispose(@NativeType("CXCompilationDatabase") long database) {
        long __functionAddress = Functions.CompilationDatabase_dispose;
        if (CHECKS) {
            check(database);
        }
        invokePV(__functionAddress, database);
    }

    // --- [ clang_CompilationDatabase_getCompileCommands ] ---

    /** Unsafe version of: {@link #clang_CompilationDatabase_getCompileCommands CompilationDatabase_getCompileCommands} */
    public static long nclang_CompilationDatabase_getCompileCommands(long database, long CompleteFileName) {
        long __functionAddress = Functions.CompilationDatabase_getCompileCommands;
        if (CHECKS) {
            check(database);
        }
        return invokePPP(__functionAddress, database, CompleteFileName);
    }

    /** Find the compile commands used for a file. The compile commands must be freed by {@code clang_CompileCommands_dispose}. */
    @NativeType("CXCompileCommands")
    public static long clang_CompilationDatabase_getCompileCommands(@NativeType("CXCompilationDatabase") long database, @NativeType("char const *") ByteBuffer CompleteFileName) {
        if (CHECKS) {
            checkNT1(CompleteFileName);
        }
        return nclang_CompilationDatabase_getCompileCommands(database, memAddress(CompleteFileName));
    }

    /** Find the compile commands used for a file. The compile commands must be freed by {@code clang_CompileCommands_dispose}. */
    @NativeType("CXCompileCommands")
    public static long clang_CompilationDatabase_getCompileCommands(@NativeType("CXCompilationDatabase") long database, @NativeType("char const *") CharSequence CompleteFileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer CompleteFileNameEncoded = stack.ASCII(CompleteFileName);
            return nclang_CompilationDatabase_getCompileCommands(database, memAddress(CompleteFileNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_CompilationDatabase_getAllCompileCommands ] ---

    /** Get all the compile commands in the given compilation database. */
    @NativeType("CXCompileCommands")
    public static long clang_CompilationDatabase_getAllCompileCommands(@NativeType("CXCompilationDatabase") long database) {
        long __functionAddress = Functions.CompilationDatabase_getAllCompileCommands;
        if (CHECKS) {
            check(database);
        }
        return invokePP(__functionAddress, database);
    }

    // --- [ clang_CompileCommands_dispose ] ---

    /** Free the given CompileCommands */
    public static void clang_CompileCommands_dispose(@NativeType("CXCompileCommands") long commands) {
        long __functionAddress = Functions.CompileCommands_dispose;
        if (CHECKS) {
            check(commands);
        }
        invokePV(__functionAddress, commands);
    }

    // --- [ clang_CompileCommands_getSize ] ---

    /** Get the number of CompileCommand we have for a file */
    @NativeType("unsigned int")
    public static int clang_CompileCommands_getSize(@NativeType("CXCompileCommands") long commands) {
        long __functionAddress = Functions.CompileCommands_getSize;
        if (CHECKS) {
            check(commands);
        }
        return invokePI(__functionAddress, commands);
    }

    // --- [ clang_CompileCommands_getCommand ] ---

    /**
     * Get the I'th CompileCommand for a file
     * 
     * <p>Note : 0 &lt;= i &lt;clang_CompileCommands_getSize(CXCompileCommands)</p>
     */
    @NativeType("CXCompileCommand")
    public static long clang_CompileCommands_getCommand(@NativeType("CXCompileCommands") long commands, @NativeType("unsigned int") int I) {
        long __functionAddress = Functions.CompileCommands_getCommand;
        if (CHECKS) {
            check(commands);
        }
        return invokePP(__functionAddress, commands, I);
    }

    // --- [ clang_CompileCommand_getDirectory ] ---

    /** Unsafe version of: {@link #clang_CompileCommand_getDirectory CompileCommand_getDirectory} */
    public static native void nclang_CompileCommand_getDirectory(long __functionAddress, long command, long __result);

    /** Unsafe version of: {@link #clang_CompileCommand_getDirectory CompileCommand_getDirectory} */
    public static void nclang_CompileCommand_getDirectory(long command, long __result) {
        long __functionAddress = Functions.CompileCommand_getDirectory;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getDirectory(__functionAddress, command, __result);
    }

    /** Get the working directory where the CompileCommand was executed from */
    public static CXString clang_CompileCommand_getDirectory(@NativeType("CXCompileCommand") long command, CXString __result) {
        nclang_CompileCommand_getDirectory(command, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getFilename ] ---

    /** Unsafe version of: {@link #clang_CompileCommand_getFilename CompileCommand_getFilename} */
    public static native void nclang_CompileCommand_getFilename(long __functionAddress, long command, long __result);

    /** Unsafe version of: {@link #clang_CompileCommand_getFilename CompileCommand_getFilename} */
    public static void nclang_CompileCommand_getFilename(long command, long __result) {
        long __functionAddress = Functions.CompileCommand_getFilename;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getFilename(__functionAddress, command, __result);
    }

    /** Get the filename associated with the CompileCommand. */
    public static CXString clang_CompileCommand_getFilename(@NativeType("CXCompileCommand") long command, CXString __result) {
        nclang_CompileCommand_getFilename(command, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getNumArgs ] ---

    /** Get the number of arguments in the compiler invocation. */
    @NativeType("unsigned int")
    public static int clang_CompileCommand_getNumArgs(@NativeType("CXCompileCommand") long command) {
        long __functionAddress = Functions.CompileCommand_getNumArgs;
        if (CHECKS) {
            check(command);
        }
        return invokePI(__functionAddress, command);
    }

    // --- [ clang_CompileCommand_getArg ] ---

    /** Unsafe version of: {@link #clang_CompileCommand_getArg CompileCommand_getArg} */
    public static native void nclang_CompileCommand_getArg(long __functionAddress, long command, int I, long __result);

    /** Unsafe version of: {@link #clang_CompileCommand_getArg CompileCommand_getArg} */
    public static void nclang_CompileCommand_getArg(long command, int I, long __result) {
        long __functionAddress = Functions.CompileCommand_getArg;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getArg(__functionAddress, command, I, __result);
    }

    /**
     * Get the I'th argument value in the compiler invocations
     * 
     * <p>Invariant :</p>
     * 
     * <ul>
     * <li>argument 0 is the compiler executable</li>
     * </ul>
     */
    public static CXString clang_CompileCommand_getArg(@NativeType("CXCompileCommand") long command, @NativeType("unsigned int") int I, CXString __result) {
        nclang_CompileCommand_getArg(command, I, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getNumMappedSources ] ---

    /** Get the number of source mappings for the compiler invocation. */
    @NativeType("unsigned int")
    public static int clang_CompileCommand_getNumMappedSources(@NativeType("CXCompileCommand") long command) {
        long __functionAddress = Functions.CompileCommand_getNumMappedSources;
        if (CHECKS) {
            check(command);
        }
        return invokePI(__functionAddress, command);
    }

    // --- [ clang_CompileCommand_getMappedSourcePath ] ---

    /** Unsafe version of: {@link #clang_CompileCommand_getMappedSourcePath CompileCommand_getMappedSourcePath} */
    public static native void nclang_CompileCommand_getMappedSourcePath(long __functionAddress, long command, int I, long __result);

    /** Unsafe version of: {@link #clang_CompileCommand_getMappedSourcePath CompileCommand_getMappedSourcePath} */
    public static void nclang_CompileCommand_getMappedSourcePath(long command, int I, long __result) {
        long __functionAddress = Functions.CompileCommand_getMappedSourcePath;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getMappedSourcePath(__functionAddress, command, I, __result);
    }

    /** Get the I'th mapped source path for the compiler invocation. */
    public static CXString clang_CompileCommand_getMappedSourcePath(@NativeType("CXCompileCommand") long command, @NativeType("unsigned int") int I, CXString __result) {
        nclang_CompileCommand_getMappedSourcePath(command, I, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getMappedSourceContent ] ---

    /** Unsafe version of: {@link #clang_CompileCommand_getMappedSourceContent CompileCommand_getMappedSourceContent} */
    public static native void nclang_CompileCommand_getMappedSourceContent(long __functionAddress, long command, int I, long __result);

    /** Unsafe version of: {@link #clang_CompileCommand_getMappedSourceContent CompileCommand_getMappedSourceContent} */
    public static void nclang_CompileCommand_getMappedSourceContent(long command, int I, long __result) {
        long __functionAddress = Functions.CompileCommand_getMappedSourceContent;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getMappedSourceContent(__functionAddress, command, I, __result);
    }

    /** Get the I'th mapped source content for the compiler invocation. */
    public static CXString clang_CompileCommand_getMappedSourceContent(@NativeType("CXCompileCommand") long command, @NativeType("unsigned int") int I, CXString __result) {
        nclang_CompileCommand_getMappedSourceContent(command, I, __result.address());
        return __result;
    }

}