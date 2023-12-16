package X;

import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.1sW  reason: invalid class name and case insensitive filesystem */
public final class C33151sW extends AnonymousClass3CR implements C184398rj {
    public File A00;
    public Executor A01;
    public final C55682qk A02;
    public final AnonymousClass49N A03;
    public final C56612sH A04;
    public final C54292oU A05;
    public final C22331Mq A06;
    public final AnonymousClass4FS A07;
    public final String A08;
    public volatile boolean A09;

    public synchronized Executor A06() {
        Executor executor;
        executor = this.A01;
        if (executor == null) {
            executor = C72173dI.A00(this.A07);
            this.A01 = executor;
        }
        return executor;
    }

    public final synchronized void A07() {
        JsonReader jsonReader;
        IOException A0C;
        if (!C615631i.A02() && !this.A09) {
            A06();
            File A052 = A05();
            if (A052 != null && A052.exists()) {
                try {
                    ArrayList A0s = AnonymousClass001.A0s();
                    jsonReader = new JsonReader(new FileReader(A052));
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("mappings".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String str = null;
                                String str2 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName = jsonReader.nextName();
                                    int hashCode = nextName.hashCode();
                                    if (hashCode != 116079) {
                                        if (hashCode == 3143036 && nextName.equals("file")) {
                                            str = jsonReader.nextString();
                                        }
                                    } else if (nextName.equals("url")) {
                                        str2 = jsonReader.nextString();
                                    }
                                }
                                jsonReader.endObject();
                                if (str == null) {
                                    A0C = AnonymousClass002.A0C("field not found: file");
                                } else if (str2 != null) {
                                    A0s.add(new AnonymousClass2OC(str, (byte[]) null, str2));
                                } else {
                                    A0C = AnonymousClass002.A0C("field not found: url");
                                }
                                throw A0C;
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        AnonymousClass2OC r2 = (AnonymousClass2OC) it.next();
                        if (AnonymousClass002.A0B(r2.A00).exists()) {
                            this.A06.A09(r2.A01, r2);
                        }
                    }
                    A0s.size();
                    A052.getAbsolutePath();
                } catch (IOException e) {
                    Log.e("diskbackedgifcache/init/error", e);
                    this.A02.A0A("disk-backed-gif-cache/load-error", false, e.toString());
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            this.A09 = true;
        }
        return;
        throw th;
    }

    public final File A05() {
        String str;
        File file = this.A00;
        if (file != null && file.exists()) {
            return this.A00;
        }
        File externalCacheDir = this.A05.A00.getExternalCacheDir();
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            str = "diskbackedgifcache/getmappingfile/external cache dir doesn't exit";
        } else {
            File A0A = AnonymousClass002.A0A(externalCacheDir, "gif/gif_cache_mem_store");
            if (A0A.exists() || A0A.mkdirs()) {
                File A0A2 = AnonymousClass002.A0A(A0A, this.A08);
                this.A00 = A0A2;
                return A0A2;
            }
            str = "diskbackedgifcache/getmappingfile/disk cache dir doesn't exit";
        }
        Log.e(str);
        return null;
    }

    public C33151sW(C55682qk r3, AnonymousClass2VE r4, C56612sH r5, C54292oU r6, AnonymousClass2MO r7, AnonymousClass4FS r8, String str, int i) {
        super(r7);
        C86494Ki r1 = new C86494Ki(this, 1);
        this.A03 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A07 = r8;
        this.A08 = str;
        C22331Mq A002 = r4.A00(i);
        this.A06 = A002;
        A002.A07(r1);
        A04();
    }

    public AnonymousClass2OC B3u(String str) {
        A07();
        return this.A06.A0A(str);
    }

    public void Bhn(AnonymousClass2OC r4, String str) {
        A07();
        this.A06.A09(str, r4);
        A06().execute(new C69993Zl(this, 36));
    }
}
