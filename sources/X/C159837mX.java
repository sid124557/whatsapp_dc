package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.soloader.SoLoader;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.7mX  reason: invalid class name and case insensitive filesystem */
public class C159837mX {
    public static int A00;
    public static C126216Mx A01;

    public static void A00(int i) {
        if (A00 == 2) {
            C158957kr r0 = C158957kr.A0A;
            if (r0 == null) {
                Log.d("profilo/control not enabled");
            } else {
                r0.A03(C156247gI.A02, 1, (long) i, 0);
            }
        }
    }

    public static void A01(Context context, int i) {
        String str;
        long abs;
        int[] iArr;
        StringBuilder sb;
        int length;
        Buffer buffer;
        int i2;
        long j;
        long j2;
        int A002;
        boolean z;
        C159137lB[] r14;
        ArrayList A0J;
        int i3;
        int i4;
        Boolean bool;
        C147627Fa r7;
        IllegalStateException th;
        Log.d("ProfiloBridge/start");
        if (A00 == 0) {
            try {
                Log.d("ProfiloBridge/init so-load-start");
                Context context2 = context;
                C155137eL.A00(context2);
                Log.d("ProfiloBridge/init so-load-end");
                SparseArray sparseArray = new SparseArray(1);
                sparseArray.put(C156247gI.A02, new C156247gI());
                C126216Mx r1 = new C126216Mx();
                A01 = r1;
                AnonymousClass843 r8 = new AnonymousClass843(context2, new C154727de(), AnonymousClass002.A0A(context2.getCacheDir(), "profilo"), new C159137lB[]{r1, new SystemCounterThread(), new ThreadMetadataProvider(), new StackFrameThread(context2), new C126206Mw()});
                if (AnonymousClass0IR.A00((Object) null, r8, AnonymousClass843.A09)) {
                    synchronized (r8) {
                        try {
                            r7 = C154727de.A00;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    synchronized (r8) {
                        try {
                            C157657if r2 = r8.A01;
                            File file = r2.A06;
                            MmapBufferManager mmapBufferManager = new MmapBufferManager(r2.A04);
                            r8.A02 = mmapBufferManager;
                            if (C158957kr.A0A == null) {
                                synchronized (C158957kr.class) {
                                    try {
                                        if (C158957kr.A0A == null) {
                                            C158957kr.A0A = new C158957kr(sparseArray, r7, r8, r8, mmapBufferManager, file);
                                        } else {
                                            throw AnonymousClass001.A0e("TraceControl already initialized");
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                SoLoader.A06("profilo");
                                if (!r7.equals(r8.A08)) {
                                    r8.A08 = r7;
                                    C158957kr r0 = C158957kr.A0A;
                                    if (r0 != null) {
                                        AtomicReference atomicReference = r0.A07;
                                        if (!AnonymousClass0IR.A00(atomicReference.get(), r7, atomicReference)) {
                                            android.util.Log.d("Profilo/TraceControl", "Tried to update the config and failed due to CAS");
                                        }
                                    } else {
                                        th = AnonymousClass001.A0e("Performing config change before TraceControl has been initialized");
                                    }
                                }
                                r2.A01 = TimeUnit.DAYS.toSeconds(1) * 1000;
                                r2.A00 = 10;
                                r8.A05.A00.add(new AnonymousClass841());
                            } else {
                                th = AnonymousClass001.A0e("TraceControl already initialized");
                            }
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    A00 = 2;
                } else {
                    th = AnonymousClass001.A0e("Orchestrator already initialized");
                    throw th;
                }
            } catch (IOException e) {
                Log.e("profilo/SoLoader initialization failed", e);
                A00 = 1;
                Log.d("ProfiloBridge/init so-load-end");
            } catch (Throwable th5) {
                th = th5;
                Log.d("ProfiloBridge/init so-load-end");
            }
        }
        if (A00 == 1) {
            str = "profilo/not enabled";
        } else {
            C158957kr r4 = C158957kr.A0A;
            if (r4 == null) {
                str = "profilo/control not enabled";
            } else {
                int i5 = C156247gI.A02;
                long j3 = (long) i;
                AtomicInteger atomicInteger = r4.A06;
                int i6 = atomicInteger.get() | 1;
                int i7 = (1 << 2) - 1;
                if (((~i6) & (i6 + 1) & i7) != 0) {
                    C156247gI r9 = (C156247gI) r4.A01.get(i5);
                    if (r9 == null) {
                        throw AnonymousClass000.A0G("Unregistered controller for id = ", AnonymousClass001.A0o(), i5);
                    } else if (r4.A00(i5, j3) == null) {
                        C147627Fa r82 = (C147627Fa) r4.A07.get();
                        ArrayList arrayList = r9.A00;
                        C152167Xu r3 = ProvidersRegistry.A00;
                        int A003 = r3.A00(arrayList);
                        if (A003 != 0) {
                            do {
                                abs = Math.abs(((Random) C158957kr.A09.get()).nextLong());
                            } while (abs <= 0);
                            String A004 = C154637dV.A00(abs);
                            android.util.Log.w("Profilo/TraceControl", AnonymousClass000.A0V("START PROFILO_TRACEID: ", A004, AnonymousClass001.A0o()));
                            TreeMap treeMap = new TreeMap();
                            int i8 = 31;
                            if (r9.A01) {
                                i8 = 13;
                            }
                            treeMap.put("provider.native_stack_trace.unwinder_thread_pri", AnonymousClass6C8.A0a("provider.stack_trace.cpu_sampling_rate_ms", Integer.valueOf(i8), treeMap));
                            treeMap.put("provider.native_stack_trace.unwinder_queue_size", 512);
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put("provider.native_stack_trace.unwind_dex_frames", Boolean.TRUE);
                            C166507yn r6 = new C166507yn(treeMap, treeMap2);
                            int A005 = r6.A00("trace_config.buffers", 1);
                            TreeMap treeMap3 = r82.A00.intParams;
                            int i9 = 5000;
                            if (treeMap3 != null && treeMap3.containsKey("system_config.buffer_size")) {
                                i9 = treeMap3.get("system_config.buffer_size");
                            }
                            int A0K = AnonymousClass001.A0K(i9);
                            boolean z2 = false;
                            TreeMap treeMap4 = r6.A00;
                            if (!(treeMap4 == null || (bool = (Boolean) treeMap4.get("trace_config.mmap_buffer")) == null)) {
                                z2 = bool.booleanValue();
                            }
                            TreeMap treeMap5 = r6.A01;
                            if (treeMap5 == null) {
                                iArr = null;
                            } else {
                                iArr = (int[]) treeMap5.get("trace_config.buffer_sizes");
                            }
                            Buffer[] bufferArr = new Buffer[A005];
                            for (int i10 = 0; i10 < A005; i10++) {
                                MmapBufferManager mmapBufferManager2 = r4.A04;
                                if (iArr == null || i10 >= iArr.length) {
                                    i4 = A0K;
                                } else {
                                    i4 = iArr[i10];
                                }
                                bufferArr[i10] = mmapBufferManager2.allocateBuffer(i4, z2);
                            }
                            C166567yu r21 = new C166567yu(r82, r6, bufferArr[0], AnonymousClass002.A0A(r4.A05, A004.replaceAll("[^a-zA-Z0-9\\-_.]", "_")), r9, A004, bufferArr, i5, A003, abs, j3);
                            Buffer[] bufferArr2 = r21.A0F;
                            int i11 = 0;
                            if (bufferArr2 == null || (length = bufferArr2.length) == 0 || (buffer = r21.A09) == null) {
                                sb = AnonymousClass001.A0o();
                                sb.append("No buffer was allocated for trace ");
                                sb.append(r21.A0D);
                                sb.append(", failing startTrace");
                            } else {
                                while (true) {
                                    int i12 = atomicInteger.get();
                                    int i13 = i12 | 1;
                                    int i14 = (~i13) & (i13 + 1) & i7;
                                    if (i14 == 0) {
                                        android.util.Log.d("Profilo/TraceControl", "Tried to start a trace and failed because no free slots were left");
                                        break;
                                    }
                                    if (atomicInteger.compareAndSet(i12, i12 | i14)) {
                                        AtomicReferenceArray atomicReferenceArray = r4.A08;
                                        int i15 = -1;
                                        while (i14 != 0) {
                                            i15++;
                                            i14 >>= 1;
                                        }
                                        if (!AnonymousClass71W.A00((Object) null, r21, atomicReferenceArray, i15)) {
                                            throw AnonymousClass002.A0E("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                                        }
                                        do {
                                            Buffer buffer2 = bufferArr2[i11];
                                            i2 = r21.A02;
                                            j = r21.A05;
                                            j2 = r21.A06;
                                            buffer2.updateHeader(i2, j, j2, 0);
                                            i11++;
                                        } while (i11 < length);
                                        int i16 = r21.A03;
                                        int i17 = i16 & 3;
                                        if (i17 != 0) {
                                            A002 = Integer.MAX_VALUE;
                                        } else {
                                            A002 = r21.A08.A00("trace_config.trace_timeout_ms", 30000);
                                        }
                                        synchronized (r4) {
                                            r4.A02();
                                            if (r4.A01(j2) != null) {
                                                C124796Dx r83 = r4.A00;
                                                synchronized (r83) {
                                                    C146427Af r142 = r83.A00;
                                                    synchronized (r142) {
                                                        try {
                                                            C149267Lr r15 = new C149267Lr(r21);
                                                            if (r15.A02) {
                                                                z = false;
                                                            } else {
                                                                if (r15.A03) {
                                                                    r142.A00.put(j2, r15);
                                                                }
                                                                try {
                                                                    C173768Rp r20 = new C173768Rp(new AnonymousClass844(r83, r21), r21.A0A.getCanonicalPath(), r21.A0E, bufferArr2, j2);
                                                                    r21.A0G = r20;
                                                                    if ((i16 & 2) == 0) {
                                                                        NativeTraceWriter nativeTraceWriter = r20.A02;
                                                                        if (i17 != 0) {
                                                                            i3 = Integer.MAX_VALUE;
                                                                        } else {
                                                                            i3 = r21.A08.A00("trace_config.trace_timeout_ms", 30000);
                                                                        }
                                                                        BufferLogger.writeAndWakeupTraceWriter(nativeTraceWriter, buffer, j2, 39, i3, i16, j2);
                                                                    }
                                                                    AnonymousClass0x2.A1Q(r83.A03, j2);
                                                                    AnonymousClass843 r12 = r83.A01;
                                                                    if (r12 != null) {
                                                                        Class<TraceEvents> cls = TraceEvents.class;
                                                                        synchronized (cls) {
                                                                            try {
                                                                                ArrayList arrayList2 = r3.A01;
                                                                                int A006 = r3.A00(arrayList2);
                                                                                if (A006 != TraceEvents.sLastNameRefreshProvidersState) {
                                                                                    TraceEvents.sLastNameRefreshProvidersState = A006;
                                                                                    synchronized (arrayList2) {
                                                                                        A0J = AnonymousClass002.A0J(arrayList2);
                                                                                    }
                                                                                    int size = A0J.size();
                                                                                    int[] iArr2 = new int[size];
                                                                                    String[] strArr = new String[size];
                                                                                    Iterator it = A0J.iterator();
                                                                                    int i18 = 0;
                                                                                    while (it.hasNext()) {
                                                                                        String A0m = AnonymousClass001.A0m(it);
                                                                                        strArr[i18] = A0m;
                                                                                        iArr2[i18] = r3.A01(A0m);
                                                                                        i18++;
                                                                                    }
                                                                                    TraceEvents.nativeRefreshProviderNames(iArr2, strArr);
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        synchronized (cls) {
                                                                            TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i2);
                                                                        }
                                                                        synchronized (r12) {
                                                                            try {
                                                                                r14 = r12.A04;
                                                                            } catch (Throwable th7) {
                                                                                while (true) {
                                                                                    th = th7;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        synchronized (r12.A06) {
                                                                            try {
                                                                                for (C159137lB r13 : r14) {
                                                                                    if ((i2 & r13.getSupportedProviders()) != 0) {
                                                                                        r13.A00().addBuffer(buffer);
                                                                                        r13.A01();
                                                                                        r13.A02(r21);
                                                                                        r13.onTraceStarted(r21, r12);
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th8) {
                                                                                while (true) {
                                                                                    th = th8;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    AnonymousClass6C7.A10(r83, r21, 1);
                                                                    r83.sendMessageDelayed(r83.obtainMessage(0, r21), (long) A002);
                                                                } catch (IOException e2) {
                                                                    StringBuilder A0o = AnonymousClass001.A0o();
                                                                    A0o.append("Could not get canonical path of trace directory ");
                                                                    th = new IllegalArgumentException(AnonymousClass000.A0R(r21.A0A, A0o), e2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                            z = true;
                                        }
                                        if (!z) {
                                            sb = AnonymousClass001.A0o();
                                            sb.append("Failed to start trace ");
                                            sb.append(r21.A0D);
                                            sb.append(" due to malformed config for context ");
                                            sb.append(j);
                                        }
                                    }
                                }
                            }
                            android.util.Log.e("Profilo/TraceControl", sb.toString());
                        }
                    }
                }
                str = "ProfiloBridge/start done";
            }
        }
        Log.d(str);
    }
}
