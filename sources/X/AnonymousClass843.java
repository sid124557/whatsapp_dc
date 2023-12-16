package X;

import android.content.Context;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.843  reason: invalid class name */
public final class AnonymousClass843 implements C185308tQ {
    public static AtomicReference A09 = new AtomicReference((Object) null);
    public C154727de A00;
    public C157657if A01;
    public MmapBufferManager A02;
    public C159137lB[] A03;
    public C159137lB[] A04;
    public final AnonymousClass842 A05;
    public final Object A06 = AnonymousClass002.A0D();
    public final Random A07;
    public volatile C147627Fa A08;

    public final void A02(C166567yu r6) {
        for (Buffer deallocateBuffer : r6.A0F) {
            if (!this.A02.deallocateBuffer(deallocateBuffer)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Could not release memory for buffer for trace: ");
                Log.e("Profilo/TraceOrchestrator", AnonymousClass000.A0X(r6.A0D, A0o));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r7.list().length > 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C166567yu r19) {
        /*
            r18 = this;
            r3 = r18
            r5 = r19
            java.io.File r7 = r5.A0A
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L_0x0036
            java.lang.String[] r0 = r7.list()
            int r1 = r0.length
            r0 = 1
            if (r1 <= r0) goto L_0x0036
        L_0x0014:
            r10 = 0
            if (r0 == 0) goto L_0x00a5
            java.lang.String r2 = ".zip.tmp"
            boolean r0 = r7.isDirectory()
            r9 = 0
            if (r0 == 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r0 = r7.getParent()
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r1)
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0014
        L_0x0038:
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r6)     // Catch:{ IOException -> 0x006e }
            r0 = 262144(0x40000, float:3.67342E-40)
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x006e }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x006e }
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0064 }
            r2.<init>(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "."
            A01(r7, r0, r2)     // Catch:{ all -> 0x005a }
            r2.flush()     // Catch:{ all -> 0x005a }
            r2.finish()     // Catch:{ all -> 0x005a }
            r2.close()     // Catch:{ all -> 0x0064 }
            r4.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x005a:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0064 }
        L_0x0063:
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x006e }
        L_0x006d:
            throw r1     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            r6.delete()
            goto L_0x0073
        L_0x0072:
            r9 = r6
        L_0x0073:
            java.lang.String r2 = "yyyy-MM-dd'T'HH-mm-ss"
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r2, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.io.File r2 = r9.getParentFile()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = r9.getName()
            java.io.File r1 = X.C18270x1.A0A(r2, r0, r1)
            boolean r0 = r9.renameTo(r1)
            if (r0 == 0) goto L_0x00a1
            r9 = r1
        L_0x00a1:
            A00(r7)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00bb
        L_0x00a5:
            java.io.File[] r1 = r7.listFiles()
            if (r1 == 0) goto L_0x00b2
            int r0 = r1.length
            if (r0 == 0) goto L_0x00b2
            r9 = r1[r10]
            if (r9 != 0) goto L_0x00bb
        L_0x00b2:
            return
        L_0x00b3:
            r2 = move-exception
            java.lang.String r1 = "Profilo/TraceOrchestrator"
            java.lang.String r0 = "failed to delete directory"
            android.util.Log.e(r1, r0, r2)
        L_0x00bb:
            X.842 r4 = r3.A05
            boolean r0 = r4.AyV(r5, r9)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r1 = "Profilo/TraceOrchestrator"
            java.lang.String r0 = "Not allowed to upload."
            android.util.Log.d(r1, r0)
            return
        L_0x00cb:
            monitor-enter(r3)
            int r0 = r5.A03     // Catch:{ all -> 0x024e }
            r0 = r0 & 3
            if (r0 == 0) goto L_0x00d3
            r10 = 1
        L_0x00d3:
            X.7if r2 = r3.A01     // Catch:{ all -> 0x024e }
            java.lang.String r6 = r9.getName()     // Catch:{ all -> 0x024e }
            r0 = 46
            int r1 = r6.lastIndexOf(r0)     // Catch:{ all -> 0x024e }
            r0 = -1
            r7 = 0
            if (r1 == r0) goto L_0x00e7
            java.lang.String r6 = r6.substring(r7, r1)     // Catch:{ all -> 0x024e }
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)     // Catch:{ all -> 0x024e }
            java.lang.String r0 = ".log"
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x024e }
            if (r10 == 0) goto L_0x00fd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x024e }
            java.lang.String r0 = "override-"
            java.lang.String r8 = X.AnonymousClass000.A0V(r0, r8, r1)     // Catch:{ all -> 0x024e }
        L_0x00fd:
            java.io.File r12 = r2.A05     // Catch:{ all -> 0x024e }
            boolean r0 = r12.isDirectory()     // Catch:{ all -> 0x024e }
            r6 = 1
            if (r0 != 0) goto L_0x0120
            boolean r0 = r12.mkdirs()     // Catch:{ all -> 0x024e }
            if (r0 != 0) goto L_0x0120
            X.7Ox r1 = r2.A02     // Catch:{ all -> 0x024e }
            int r0 = r1.A01     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A01 = r0     // Catch:{ all -> 0x024e }
        L_0x0114:
            X.7Ox r6 = r2.A02     // Catch:{ all -> 0x024e }
            X.7Ox r0 = new X.7Ox     // Catch:{ all -> 0x024e }
            r0.<init>()     // Catch:{ all -> 0x024e }
            r2.A02 = r0     // Catch:{ all -> 0x024e }
            monitor-exit(r3)     // Catch:{ all -> 0x024e }
            goto L_0x0236
        L_0x0120:
            java.io.File r0 = X.AnonymousClass002.A0A(r12, r8)     // Catch:{ all -> 0x024e }
            boolean r0 = r9.renameTo(r0)     // Catch:{ all -> 0x024e }
            X.7Ox r1 = r2.A02     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x01da
            int r0 = r1.A00     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x024e }
        L_0x0132:
            java.io.File r9 = r2.A06     // Catch:{ all -> 0x024e }
            long r0 = r2.A01     // Catch:{ all -> 0x024e }
            r8 = 2
            java.io.FilenameFilter[] r14 = new java.io.FilenameFilter[r8]     // Catch:{ all -> 0x024e }
            java.io.FilenameFilter r17 = X.C157657if.A07     // Catch:{ all -> 0x024e }
            r14[r7] = r17     // Catch:{ all -> 0x024e }
            java.io.FilenameFilter r16 = X.C157657if.A08     // Catch:{ all -> 0x024e }
            r14[r6] = r16     // Catch:{ all -> 0x024e }
            boolean r10 = r12.exists()     // Catch:{ all -> 0x024e }
            if (r10 != 0) goto L_0x0162
            boolean r10 = r12.isDirectory()     // Catch:{ all -> 0x024e }
            if (r10 != 0) goto L_0x0162
        L_0x014d:
            int r11 = r2.A00     // Catch:{ all -> 0x024e }
            java.io.FilenameFilter[] r12 = new java.io.FilenameFilter[r8]     // Catch:{ all -> 0x024e }
            r12[r7] = r17     // Catch:{ all -> 0x024e }
            r12[r6] = r16     // Catch:{ all -> 0x024e }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x024e }
            if (r0 != 0) goto L_0x01e2
            boolean r0 = r9.isDirectory()     // Catch:{ all -> 0x024e }
            if (r0 != 0) goto L_0x01e2
            goto L_0x0114
        L_0x0162:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x024e }
            r13 = 0
        L_0x0167:
            r10 = r14[r13]     // Catch:{ all -> 0x024e }
            java.io.File[] r10 = r12.listFiles(r10)     // Catch:{ all -> 0x024e }
            if (r10 != 0) goto L_0x0179
            java.util.List r10 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x024e }
        L_0x0171:
            r11.addAll(r10)     // Catch:{ all -> 0x024e }
            int r13 = r13 + 1
            if (r13 < r8) goto L_0x0167
            goto L_0x017e
        L_0x0179:
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ all -> 0x024e }
            goto L_0x0171
        L_0x017e:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024e }
            long r14 = r14 - r0
            java.util.Iterator r13 = r11.iterator()     // Catch:{ all -> 0x024e }
        L_0x0187:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x024e }
            java.io.File r10 = (java.io.File) r10     // Catch:{ all -> 0x024e }
            long r11 = r10.lastModified()     // Catch:{ all -> 0x024e }
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0187
            java.lang.String r0 = r10.getName()     // Catch:{ all -> 0x024e }
            java.io.File r0 = X.AnonymousClass002.A0A(r9, r0)     // Catch:{ all -> 0x024e }
            boolean r0 = r10.renameTo(r0)     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x01ab
            r0 = 1
            goto L_0x01c8
        L_0x01ab:
            X.7Ox r1 = r2.A02     // Catch:{ all -> 0x024e }
            int r0 = r1.A03     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x024e }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x01c7
            boolean r0 = r10.delete()     // Catch:{ all -> 0x024e }
            if (r0 != 0) goto L_0x01c7
            X.7Ox r1 = r2.A02     // Catch:{ all -> 0x024e }
            int r0 = r1.A02     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A02 = r0     // Catch:{ all -> 0x024e }
        L_0x01c7:
            r0 = 0
        L_0x01c8:
            X.7Ox r1 = r2.A02     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x01d3
            int r0 = r1.A05     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A05 = r0     // Catch:{ all -> 0x024e }
            goto L_0x0187
        L_0x01d3:
            int r0 = r1.A04     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ all -> 0x024e }
            goto L_0x0187
        L_0x01da:
            int r0 = r1.A03     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x024e }
            goto L_0x0132
        L_0x01e2:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x024e }
            r1 = 0
        L_0x01e7:
            r0 = r12[r1]     // Catch:{ all -> 0x024e }
            java.io.File[] r0 = r9.listFiles(r0)     // Catch:{ all -> 0x024e }
            if (r0 != 0) goto L_0x01f9
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x024e }
        L_0x01f1:
            r10.addAll(r0)     // Catch:{ all -> 0x024e }
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x01e7
            goto L_0x01fe
        L_0x01f9:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x024e }
            goto L_0x01f1
        L_0x01fe:
            int r0 = r10.size()     // Catch:{ all -> 0x024e }
            if (r0 <= r11) goto L_0x0114
            X.AnonymousClass91R.A00(r2, r10, r6)     // Catch:{ all -> 0x024e }
            int r0 = r10.size()     // Catch:{ all -> 0x024e }
            int r0 = r0 - r11
            java.util.List r0 = r10.subList(r7, r0)     // Catch:{ all -> 0x024e }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x024e }
        L_0x0214:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x0114
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x024e }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x024e }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x024e }
            X.7Ox r1 = r2.A02     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x022f
            int r0 = r1.A06     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ all -> 0x024e }
            goto L_0x0214
        L_0x022f:
            int r0 = r1.A04     // Catch:{ all -> 0x024e }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ all -> 0x024e }
            goto L_0x0214
        L_0x0236:
            r4.BeK(r5)
            int r3 = r6.A02
            int r0 = r6.A03
            int r3 = r3 + r0
            int r0 = r6.A01
            int r3 = r3 + r0
            int r0 = r6.A04
            int r3 = r3 + r0
            int r2 = r6.A06
            int r1 = r6.A05
            int r0 = r6.A00
            r4.BeJ(r3, r2, r1, r0)
            return
        L_0x024e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x024e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass843.A03(X.7yu):void");
    }

    public void BeN(C166567yu r7, int i) {
        String str;
        IllegalStateException th;
        C147627Fa r2;
        try {
            this.A05.BeN(r7, i);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Trace is aborted with code: ");
            switch (i) {
                case 1:
                    str = "unknown";
                    break;
                case 2:
                    str = "controller_init";
                    break;
                case 3:
                    str = "missed_event";
                    break;
                case 4:
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                    break;
                case 5:
                    str = "new_start";
                    break;
                case 6:
                    str = "condition_not_met";
                    break;
                case 8:
                    str = "writer_exception";
                    break;
                case 9:
                    str = "logout";
                    break;
                default:
                    str = AnonymousClass000.A0Y("UNKNOWN REASON ", AnonymousClass001.A0o(), i);
                    break;
            }
            AnonymousClass000.A1F(str, "Profilo/TraceOrchestrator", A0o);
            C158957kr r22 = C158957kr.A0A;
            if (r22 != null) {
                r22.A04(r7.A06, i);
                File file = r7.A0A;
                if (file.exists()) {
                    synchronized (this) {
                        try {
                            r2 = this.A08;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                            }
                        }
                    }
                    if (r2 != null && i == 4) {
                        TreeMap treeMap = r2.A00.intParams;
                        int i2 = 0;
                        if (treeMap != null && treeMap.containsKey("system_config.timed_out_upload_sample_rate")) {
                            i2 = treeMap.get("system_config.timed_out_upload_sample_rate");
                        }
                        int A052 = AnonymousClass0x7.A05(i2);
                        if (A052 != 0 && this.A07.nextInt(A052) == 0) {
                            A03(r7);
                        }
                    }
                    A00(file);
                }
                A02(r7);
                return;
            }
            th = AnonymousClass001.A0e("No TraceControl when cleaning up aborted trace");
            throw th;
        } catch (Exception e) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
        } catch (Throwable th3) {
            A02(r7);
            throw th3;
        }
    }

    public void BeO(C166567yu r2) {
        try {
            this.A05.BeO(r2);
            if (r2.A0A.exists()) {
                A03(r2);
            }
        } finally {
            A02(r2);
        }
    }

    public void BeP(C166567yu r3, Throwable th) {
        Log.e("Profilo/TraceOrchestrator", "Write exception", th);
        this.A05.BeP(r3, th);
        BeN(r3, 8);
    }

    public void BeQ(C166567yu r2) {
        this.A05.BeQ(r2);
    }

    public AnonymousClass843(Context context, C154727de r8, File file, C159137lB[] r10) {
        this.A00 = r8;
        this.A08 = null;
        this.A01 = new C157657if(context, file);
        this.A07 = new Random();
        this.A05 = new AnonymousClass842();
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (C159137lB r1 : r10) {
            if (r1 instanceof C126216Mx) {
                A0s.add(r1);
            } else {
                A0s2.add(r1);
            }
        }
        this.A03 = (C159137lB[]) A0s2.toArray(new C159137lB[A0s2.size()]);
        this.A04 = (C159137lB[]) A0s.toArray(new C159137lB[A0s.size()]);
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String A0A : list) {
                    File A0A2 = AnonymousClass002.A0A(file, A0A);
                    if (A0A2.isDirectory()) {
                        A00(A0A2);
                    } else {
                        A0A2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static void A01(File file, String str, ZipOutputStream zipOutputStream) {
        FileInputStream A0g;
        File absoluteFile = AnonymousClass002.A0A(file, str).getAbsoluteFile();
        URI uri = file.toURI();
        for (String A0A : absoluteFile.list()) {
            File A0A2 = AnonymousClass002.A0A(absoluteFile, A0A);
            if (A0A2.exists()) {
                String path = uri.relativize(A0A2.toURI()).getPath();
                if (A0A2.isFile()) {
                    try {
                        A0g = AnonymousClass0x9.A0g(AnonymousClass002.A0A(file, path));
                        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                        zipOutputStream.putNextEntry(new ZipEntry(path));
                        while (true) {
                            int read = A0g.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        A0g.close();
                        zipOutputStream.closeEntry();
                    } catch (Throwable th) {
                        zipOutputStream.closeEntry();
                        throw th;
                    }
                } else if (A0A2.isDirectory()) {
                    A01(file, path, zipOutputStream);
                }
            }
        }
        return;
        throw th;
    }
}
