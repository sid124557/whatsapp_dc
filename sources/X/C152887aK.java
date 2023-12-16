package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7aK  reason: invalid class name and case insensitive filesystem */
public class C152887aK {
    public File A00;
    public final C54292oU A01;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d8, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:27:0x006a, B:42:0x00c8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.watls13.WtPersistentSession A00(java.io.File r21) {
        /*
            r20 = this;
            r13 = 0
            if (r21 == 0) goto L_0x00f2
            boolean r0 = r21.exists()
            if (r0 == 0) goto L_0x00f2
            byte[] r1 = X.C382926u.A00(r21)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00ec }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00ec }
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "sni"
            java.lang.String r15 = r6.getString(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "port"
            int r19 = r6.getInt(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "cipher"
            java.lang.String r16 = r6.getString(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "psks"
            org.json.JSONArray r5 = r6.optJSONArray(r0)     // Catch:{ Exception -> 0x00ec }
            if (r5 == 0) goto L_0x006e
            java.util.LinkedHashSet r9 = X.AnonymousClass0x9.A17()     // Catch:{ Exception -> 0x00ec }
            r4 = 0
            r1 = 0
        L_0x0036:
            int r0 = r5.length()     // Catch:{ Exception -> 0x00ec }
            if (r1 >= r0) goto L_0x006f
            java.lang.String r0 = r5.getString(r1)     // Catch:{ Exception -> 0x00ec }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x00ec }
            java.io.ByteArrayInputStream r3 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ Exception -> 0x00ec }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0069 }
            r2.<init>(r3)     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r2.readObject()     // Catch:{ all -> 0x005f }
            com.whatsapp.net.tls13.WtCachedPsk r0 = (com.whatsapp.net.tls13.WtCachedPsk) r0     // Catch:{ all -> 0x005f }
            r2.close()     // Catch:{ all -> 0x0069 }
            r3.close()     // Catch:{ Exception -> 0x00ec }
            r9.add(r0)     // Catch:{ Exception -> 0x00ec }
            int r1 = r1 + 1
            goto L_0x0036
        L_0x005f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x006e:
            r9 = 0
        L_0x006f:
            java.lang.String r0 = "certs"
            org.json.JSONObject r10 = r6.getJSONObject(r0)     // Catch:{ Exception -> 0x00ec }
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x00ec }
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x00ec }
            java.util.Iterator r12 = r10.keys()     // Catch:{ Exception -> 0x00ec }
        L_0x0081:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x00ec }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = X.AnonymousClass001.A0m(r12)     // Catch:{ Exception -> 0x00ec }
            java.lang.Byte r6 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x00ec }
            org.json.JSONArray r5 = r10.getJSONArray(r0)     // Catch:{ Exception -> 0x00ec }
            int r0 = r5.length()     // Catch:{ Exception -> 0x00ec }
            java.security.cert.Certificate[] r4 = new java.security.cert.Certificate[r0]     // Catch:{ Exception -> 0x00ec }
            r3 = 0
            r2 = 0
        L_0x009b:
            int r0 = r5.length()     // Catch:{ Exception -> 0x00ec }
            if (r2 >= r0) goto L_0x00d4
            org.json.JSONObject r1 = r5.getJSONObject(r2)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "type"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "data"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x00ec }
            byte[] r1 = android.util.Base64.decode(r0, r3)     // Catch:{ Exception -> 0x00ec }
            java.lang.Object r0 = r8.get(r11)     // Catch:{ Exception -> 0x00ec }
            java.security.cert.CertificateFactory r0 = (java.security.cert.CertificateFactory) r0     // Catch:{ Exception -> 0x00ec }
            if (r0 != 0) goto L_0x00c4
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r11)     // Catch:{ Exception -> 0x00ec }
            r8.put(r11, r0)     // Catch:{ Exception -> 0x00ec }
        L_0x00c4:
            java.io.ByteArrayInputStream r1 = X.AnonymousClass0x9.A0d(r1)     // Catch:{ Exception -> 0x00ec }
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch:{ all -> 0x00d8 }
            r4[r2] = r0     // Catch:{ all -> 0x00d8 }
            r1.close()     // Catch:{ Exception -> 0x00ec }
            int r2 = r2 + 1
            goto L_0x009b
        L_0x00d4:
            r7.put(r6, r4)     // Catch:{ Exception -> 0x00ec }
            goto L_0x0081
        L_0x00d8:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ Exception -> 0x00ec }
        L_0x00e1:
            throw r2     // Catch:{ Exception -> 0x00ec }
        L_0x00e2:
            com.whatsapp.watls13.WtPersistentSession r14 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ Exception -> 0x00ec }
            r18 = r7
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00ec }
            return r14
        L_0x00ec:
            r1 = move-exception
            java.lang.String r0 = "WtPersistentSessionCacheImpl/readSession: unable to deserialize persisted session"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00f2:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152887aK.A00(java.io.File):com.whatsapp.watls13.WtPersistentSession");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.File r0 = r3.A00     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            X.2oU r0 = r3.A01     // Catch:{ all -> 0x0042 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0042 }
            r2 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            return r2
        L_0x000e:
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "watls-sessions"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0042 }
            r3.A00 = r0     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x002c
            java.io.File r0 = r3.A00     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.mkdir()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x002c
            r3.A00 = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            return r2
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "WtPersistentSessionCacheImpl/getCacheDir: using external persistent cache directory "
            r1.append(r0)     // Catch:{ all -> 0x0042 }
            java.io.File r0 = r3.A00     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0042 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0042 }
            java.io.File r0 = r3.A00     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152887aK.A01():java.io.File");
    }

    public synchronized void A02(Object obj, byte[] bArr) {
        RuntimeException runtimeException;
        JSONArray jSONArray;
        ObjectOutputStream objectOutputStream;
        if (A01() != null) {
            File A0A = AnonymousClass002.A0A(A01(), Base64.encodeToString(bArr, 10));
            try {
                WtPersistentSession wtPersistentSession = (WtPersistentSession) obj;
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("sni", wtPersistentSession.A02);
                A1G.put("port", wtPersistentSession.A00);
                A1G.put("cipher", wtPersistentSession.A01);
                LinkedHashSet linkedHashSet = wtPersistentSession.A03;
                if (linkedHashSet != null) {
                    jSONArray = AnonymousClass0x9.A1F();
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        WtCachedPsk wtCachedPsk = (WtCachedPsk) it.next();
                        try {
                            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                            try {
                                objectOutputStream = new ObjectOutputStream(A0e);
                                objectOutputStream.writeObject(wtCachedPsk);
                                byte[] byteArray = A0e.toByteArray();
                                objectOutputStream.close();
                                A0e.close();
                                jSONArray.put(C18290x4.A0t(byteArray));
                            } catch (Throwable th) {
                                A0e.close();
                                throw th;
                            }
                        } catch (IOException e) {
                            runtimeException = C18330xA.A09(e);
                            throw runtimeException;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } else {
                    jSONArray = null;
                }
                A1G.put("psks", jSONArray);
                Map map = wtPersistentSession.A04;
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    Certificate[] certificateArr = (Certificate[]) A0w.getValue();
                    int length = certificateArr.length;
                    int i = 0;
                    while (i < length) {
                        Certificate certificate = certificateArr[i];
                        JSONObject A1G3 = AnonymousClass0x9.A1G();
                        A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, certificate.getType());
                        try {
                            A1G3.put("data", C18290x4.A0t(certificate.getEncoded()));
                            A1F.put(A1G3);
                            i++;
                        } catch (CertificateEncodingException e2) {
                            runtimeException = C18330xA.A09(e2);
                            throw runtimeException;
                        }
                    }
                    A1G2.put(String.valueOf(A0w.getKey()), A1F);
                }
                A1G.put("certs", A1G2);
                C627536m.A0H(A0A, A1G.toString().getBytes());
            } catch (JSONException e3) {
                throw C18330xA.A09(e3);
            } catch (Exception e4) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A10(A0A, "WtPersistentSessionCacheImpl/putSession: Error during put session ", A0o);
                C18260x0.A1Q(A0o, " : ", e4);
            }
        }
        return;
        throw th;
    }

    public synchronized void A03(byte[] bArr) {
        if (A01() != null) {
            File A0A = AnonymousClass002.A0A(A01(), Base64.encodeToString(bArr, 10));
            if (!A0A.delete()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WtPersistentSessionCacheImpl/removeSession: Error during remove session ");
                C18260x0.A1K(A0o, A0A.getAbsolutePath());
            }
        }
    }

    public C152887aK(C54292oU r1) {
        this.A01 = r1;
    }
}
