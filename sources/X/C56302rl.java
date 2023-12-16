package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2rl  reason: invalid class name and case insensitive filesystem */
public class C56302rl {
    public final AnonymousClass1RE A00;
    public final C183538qC A01;

    public C56302rl(AnonymousClass1RE r1, C183538qC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:263:0x0520=Splitter:B:263:0x0520, B:276:0x0536=Splitter:B:276:0x0536, B:237:0x04c9=Splitter:B:237:0x04c9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(X.C30301mE r12) {
        /*
            r11 = this;
            X.C626936e.A00()
            X.1RE r0 = r11.A00
            X.4Fq r8 = r0.A0C()
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x055b }
            java.lang.String r1 = "message_type"
            byte r0 = r12.A1I     // Catch:{ all -> 0x055b }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x055b }
            r5.put(r1, r0)     // Catch:{ all -> 0x055b }
            java.lang.String r1 = "key_remote_jid"
            X.2z0 r2 = r12.A1J     // Catch:{ all -> 0x055b }
            X.4uZ r0 = X.AnonymousClass2z0.A01(r2)     // Catch:{ all -> 0x055b }
            X.AnonymousClass0x2.A0n(r5, r0, r1)     // Catch:{ all -> 0x055b }
            java.lang.String r1 = "key_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x055b }
            r7 = 0
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C18270x1.A0b(r5, r1, r0)     // Catch:{ all -> 0x055b }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x055b }
            r5.put(r1, r0)     // Catch:{ all -> 0x055b }
            java.lang.String r2 = "timestamp"
            long r0 = r12.A0K     // Catch:{ all -> 0x055b }
            X.C18270x1.A0c(r5, r2, r0)     // Catch:{ all -> 0x055b }
            com.whatsapp.jid.DeviceJid r1 = r12.A00     // Catch:{ all -> 0x055b }
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "device_id"
            X.AnonymousClass0x2.A0n(r5, r1, r0)     // Catch:{ all -> 0x055b }
        L_0x0048:
            java.lang.String r6 = "data"
            boolean r0 = r12 instanceof X.C30891nN     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x00a0
            r9 = r12
            X.1nN r9 = (X.C30891nN) r9     // Catch:{ all -> 0x055b }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0533 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0533 }
            r2.beginObject()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "requestType"
            android.util.JsonWriter r3 = r2.name(r0)     // Catch:{ all -> 0x0096 }
            int r0 = r9.A00     // Catch:{ all -> 0x0096 }
            long r0 = (long) r0     // Catch:{ all -> 0x0096 }
            r3.value(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "identifierSet"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0096 }
            r0.beginArray()     // Catch:{ all -> 0x0096 }
            java.util.Set r0 = r9.A01     // Catch:{ all -> 0x0096 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0096 }
        L_0x007a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ all -> 0x0096 }
            r2.value(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x007a
        L_0x0088:
            r2.endArray()     // Catch:{ all -> 0x0096 }
            r2.endObject()     // Catch:{ all -> 0x0096 }
            r2.flush()     // Catch:{ all -> 0x0096 }
            r2.close()     // Catch:{ IOException -> 0x0533 }
            goto L_0x0520
        L_0x0096:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0533 }
        L_0x009f:
            throw r1     // Catch:{ IOException -> 0x0533 }
        L_0x00a0:
            boolean r0 = r12 instanceof X.AnonymousClass1OS     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x014e
            r1 = r12
            X.1OS r1 = (X.AnonymousClass1OS) r1     // Catch:{ all -> 0x055b }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0149 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0149 }
            X.C30301mE.A01(r2, r1)     // Catch:{ all -> 0x013f }
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "stickerResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x013f }
            r0.beginObject()     // Catch:{ all -> 0x013f }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x013f }
            java.util.Iterator r10 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x013f }
        L_0x00c8:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0102
            java.util.Map$Entry r9 = X.AnonymousClass001.A0w(r10)     // Catch:{ all -> 0x013f }
            java.lang.String r1 = X.C18310x6.A0q(r9)     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x013f }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x013f }
            X.23E r0 = (X.AnonymousClass23E) r0     // Catch:{ all -> 0x013f }
            r3.put(r1, r0)     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x013f }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x013f }
            X.1EA r1 = (X.AnonymousClass1EA) r1     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = X.C18310x6.A0q(r9)     // Catch:{ all -> 0x013f }
            r2.name(r0)     // Catch:{ all -> 0x013f }
            byte[] r0 = r1.A0F()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x013f }
            r2.value(r0)     // Catch:{ all -> 0x013f }
            goto L_0x00c8
        L_0x0102:
            r2.endObject()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x013f }
            r0.beginObject()     // Catch:{ all -> 0x013f }
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r3)     // Catch:{ all -> 0x013f }
        L_0x0113:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0131
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r3)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.C18310x6.A0q(r1)     // Catch:{ all -> 0x013f }
            r2.name(r0)     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x013f }
            X.23E r0 = (X.AnonymousClass23E) r0     // Catch:{ all -> 0x013f }
            int r0 = r0.value     // Catch:{ all -> 0x013f }
            long r0 = (long) r0     // Catch:{ all -> 0x013f }
            r2.value(r0)     // Catch:{ all -> 0x013f }
            goto L_0x0113
        L_0x0131:
            r2.endObject()     // Catch:{ all -> 0x013f }
            r2.endObject()     // Catch:{ all -> 0x013f }
            r2.flush()     // Catch:{ all -> 0x013f }
            r2.close()     // Catch:{ IOException -> 0x0149 }
            goto L_0x0520
        L_0x013f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0149 }
        L_0x0148:
            throw r1     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/writeData failed"
            goto L_0x0536
        L_0x014e:
            boolean r0 = r12 instanceof X.AnonymousClass1OP     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x0180
            r2 = r12
            X.1nL r2 = (X.C30871nL) r2     // Catch:{ all -> 0x055b }
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r1.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x017b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x017b }
            X.C30301mE.A01(r0, r2)     // Catch:{ all -> 0x0171 }
            r0.endObject()     // Catch:{ all -> 0x0171 }
            r0.flush()     // Catch:{ all -> 0x0171 }
            r0.close()     // Catch:{ IOException -> 0x017b }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x055b }
            goto L_0x0541
        L_0x0171:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0176:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x017b }
        L_0x017a:
            throw r1     // Catch:{ IOException -> 0x017b }
        L_0x017b:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/writeData failed"
            goto L_0x0536
        L_0x0180:
            boolean r0 = r12 instanceof X.AnonymousClass1OQ     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x01e0
            r1 = r12
            X.1OQ r1 = (X.AnonymousClass1OQ) r1     // Catch:{ all -> 0x055b }
            r2 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x053b }
            r3.<init>()     // Catch:{ IOException -> 0x053b }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x01d9 }
            r4.<init>(r3)     // Catch:{ all -> 0x01d9 }
            X.C30301mE.A01(r4, r1)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "peerDataOperationResults"
            r4.name(r0)     // Catch:{ all -> 0x01d2 }
            r4.beginArray()     // Catch:{ all -> 0x01d2 }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x01a4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01d2 }
            X.1Cm r0 = (X.C21611Cm) r0     // Catch:{ all -> 0x01d2 }
            byte[] r0 = r0.A0F()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x01d2 }
            r4.value(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x01a4
        L_0x01bc:
            r4.endArray()     // Catch:{ all -> 0x01d2 }
            r4.endObject()     // Catch:{ all -> 0x01d2 }
            r4.flush()     // Catch:{ all -> 0x01d2 }
            r4.close()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01d9 }
            r3.close()     // Catch:{ IOException -> 0x053b }
            r2 = r0
            goto L_0x0541
        L_0x01d2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x01d9 }
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01db }
        L_0x01db:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x053b }
            throw r0     // Catch:{ IOException -> 0x053b }
        L_0x01e0:
            boolean r0 = r12 instanceof X.AnonymousClass1OR     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x028d
            r1 = r12
            X.1OR r1 = (X.AnonymousClass1OR) r1     // Catch:{ all -> 0x055b }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0288 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0288 }
            X.C30301mE.A01(r2, r1)     // Catch:{ all -> 0x027e }
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "linkPreviewResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x027e }
            r0.beginObject()     // Catch:{ all -> 0x027e }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x027e }
            java.util.Iterator r10 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x027e }
        L_0x0207:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x0241
            java.util.Map$Entry r9 = X.AnonymousClass001.A0w(r10)     // Catch:{ all -> 0x027e }
            java.lang.String r1 = X.C18310x6.A0q(r9)     // Catch:{ all -> 0x027e }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x027e }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x027e }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x027e }
            X.23E r0 = (X.AnonymousClass23E) r0     // Catch:{ all -> 0x027e }
            r3.put(r1, r0)     // Catch:{ all -> 0x027e }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x027e }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x027e }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x027e }
            X.1Dj r1 = (X.C21841Dj) r1     // Catch:{ all -> 0x027e }
            if (r1 == 0) goto L_0x0207
            java.lang.String r0 = X.C18310x6.A0q(r9)     // Catch:{ all -> 0x027e }
            r2.name(r0)     // Catch:{ all -> 0x027e }
            byte[] r0 = r1.A0F()     // Catch:{ all -> 0x027e }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x027e }
            r2.value(r0)     // Catch:{ all -> 0x027e }
            goto L_0x0207
        L_0x0241:
            r2.endObject()     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x027e }
            r0.beginObject()     // Catch:{ all -> 0x027e }
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r3)     // Catch:{ all -> 0x027e }
        L_0x0252:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x0270
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r3)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = X.C18310x6.A0q(r1)     // Catch:{ all -> 0x027e }
            r2.name(r0)     // Catch:{ all -> 0x027e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x027e }
            X.23E r0 = (X.AnonymousClass23E) r0     // Catch:{ all -> 0x027e }
            int r0 = r0.value     // Catch:{ all -> 0x027e }
            long r0 = (long) r0     // Catch:{ all -> 0x027e }
            r2.value(r0)     // Catch:{ all -> 0x027e }
            goto L_0x0252
        L_0x0270:
            r2.endObject()     // Catch:{ all -> 0x027e }
            r2.endObject()     // Catch:{ all -> 0x027e }
            r2.flush()     // Catch:{ all -> 0x027e }
            r2.close()     // Catch:{ IOException -> 0x0288 }
            goto L_0x0520
        L_0x027e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0283 }
            goto L_0x0287
        L_0x0283:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0288 }
        L_0x0287:
            throw r1     // Catch:{ IOException -> 0x0288 }
        L_0x0288:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/writeData failed"
            goto L_0x0536
        L_0x028d:
            boolean r0 = r12 instanceof X.C30881nM     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x02c6
            r4 = r12
            X.1nM r4 = (X.C30881nM) r4     // Catch:{ all -> 0x055b }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r3.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x02c1 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x02c1 }
            android.util.JsonWriter r1 = r2.beginObject()     // Catch:{ all -> 0x02b7 }
            java.lang.String r0 = "security_notification_enabled"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x02b7 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x02b7 }
            android.util.JsonWriter r0 = r1.value(r0)     // Catch:{ all -> 0x02b7 }
            r0.endObject()     // Catch:{ all -> 0x02b7 }
            r2.close()     // Catch:{ IOException -> 0x02c1 }
            goto L_0x04c9
        L_0x02b7:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02bc }
            goto L_0x02c0
        L_0x02bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x02c1 }
        L_0x02c0:
            throw r1     // Catch:{ IOException -> 0x02c1 }
        L_0x02c1:
            r1 = move-exception
            java.lang.String r0 = "FMessageInitialSecurityNotificationSettingSync/writeData failed"
            goto L_0x0536
        L_0x02c6:
            boolean r0 = r12 instanceof X.AnonymousClass1nO     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x042e
            r3 = r12
            X.1nO r3 = (X.AnonymousClass1nO) r3     // Catch:{ all -> 0x055b }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0429 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0429 }
            r2.beginObject()     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x02ed
            java.lang.String r0 = "direct_path"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x02ed:
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x0300
            java.lang.String r0 = "media_hash"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x0300:
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x0313
            java.lang.String r0 = "enc_media_hash"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x0313:
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x0327
            java.lang.String r0 = "original-msg-id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x0327:
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x033b
            java.lang.String r0 = "session_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x033b:
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x034f
            java.lang.String r0 = "reg_attempt_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x034f:
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x041f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x041f }
            if (r0 != 0) goto L_0x0363
            java.lang.String r0 = "peer_data_request_session_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x041f }
            r1.value(r0)     // Catch:{ all -> 0x041f }
        L_0x0363:
            java.lang.String r0 = "file_length"
            android.util.JsonWriter r9 = r2.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A05     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "sync_type"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            int r0 = r3.A03     // Catch:{ all -> 0x041f }
            long r0 = (long) r0     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "chunk_order"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            int r0 = r3.A00     // Catch:{ all -> 0x041f }
            long r0 = (long) r0     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "progress"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            int r0 = r3.A01     // Catch:{ all -> 0x041f }
            long r0 = (long) r0     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "retries"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            int r0 = r3.A02     // Catch:{ all -> 0x041f }
            long r0 = (long) r0     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "latest_msg_id"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A06     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "oldest_msg_id"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A08     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "oldest_msg_id_to_sync"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A09     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "chats_count"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A04     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "messages_count"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A07     // Catch:{ all -> 0x041f }
            android.util.JsonWriter r1 = r9.value(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            android.util.JsonWriter r9 = r1.name(r0)     // Catch:{ all -> 0x041f }
            long r0 = r3.A0A     // Catch:{ all -> 0x041f }
            r9.value(r0)     // Catch:{ all -> 0x041f }
            byte[] r0 = r3.A0J     // Catch:{ all -> 0x041f }
            r9 = 2
            if (r0 == 0) goto L_0x0403
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "key_data"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x041f }
            r0.value(r1)     // Catch:{ all -> 0x041f }
        L_0x0403:
            byte[] r0 = r3.A0I     // Catch:{ all -> 0x041f }
            if (r0 == 0) goto L_0x0414
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "inline_payload"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x041f }
            r0.value(r1)     // Catch:{ all -> 0x041f }
        L_0x0414:
            r2.endObject()     // Catch:{ all -> 0x041f }
            r2.flush()     // Catch:{ all -> 0x041f }
            r2.close()     // Catch:{ IOException -> 0x0429 }
            goto L_0x0520
        L_0x041f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0424 }
            goto L_0x0428
        L_0x0424:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0429 }
        L_0x0428:
            throw r1     // Catch:{ IOException -> 0x0429 }
        L_0x0429:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/writeData failed"
            goto L_0x0536
        L_0x042e:
            boolean r0 = r12 instanceof X.C30851nJ     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x047e
            r4 = r12
            X.1nJ r4 = (X.C30851nJ) r4     // Catch:{ all -> 0x055b }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r3.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0479 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0479 }
            r2.beginObject()     // Catch:{ all -> 0x046f }
            X.1A8 r0 = r4.A00     // Catch:{ all -> 0x046f }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x046f }
            X.1A8 r0 = r4.A00     // Catch:{ all -> 0x046f }
            byte[] r0 = r0.A0F()     // Catch:{ all -> 0x046f }
            java.lang.String r1 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x046f }
            r0.value(r1)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "isNewlyGeneratedKey"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x046f }
            boolean r0 = r4.A01     // Catch:{ all -> 0x046f }
            r1.value(r0)     // Catch:{ all -> 0x046f }
            r2.endObject()     // Catch:{ all -> 0x046f }
            r2.flush()     // Catch:{ all -> 0x046f }
            r2.close()     // Catch:{ IOException -> 0x0479 }
            goto L_0x04c9
        L_0x046f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0474 }
            goto L_0x0478
        L_0x0474:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0479 }
        L_0x0478:
            throw r1     // Catch:{ IOException -> 0x0479 }
        L_0x0479:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/writeData failed"
            goto L_0x0536
        L_0x047e:
            boolean r0 = r12 instanceof X.C30841nI     // Catch:{ all -> 0x055b }
            if (r0 == 0) goto L_0x04dc
            r1 = r12
            X.1nI r1 = (X.C30841nI) r1     // Catch:{ all -> 0x055b }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r3.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x04d8 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x04d8 }
            r2.beginObject()     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = "key-ids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x04ce }
            r0.beginArray()     // Catch:{ all -> 0x04ce }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x04ce }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x04ce }
        L_0x04a1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04ce }
            if (r0 == 0) goto L_0x04bd
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04ce }
            X.33J r0 = (X.AnonymousClass33J) r0     // Catch:{ all -> 0x04ce }
            X.1AH r0 = r0.A01()     // Catch:{ all -> 0x04ce }
            byte[] r0 = r0.A0F()     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x04ce }
            r2.value(r0)     // Catch:{ all -> 0x04ce }
            goto L_0x04a1
        L_0x04bd:
            r2.endArray()     // Catch:{ all -> 0x04ce }
            r2.endObject()     // Catch:{ all -> 0x04ce }
            r2.flush()     // Catch:{ all -> 0x04ce }
            r2.close()     // Catch:{ IOException -> 0x04d8 }
        L_0x04c9:
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x055b }
            goto L_0x0541
        L_0x04ce:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x04d3 }
            goto L_0x04d7
        L_0x04d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x04d8 }
        L_0x04d7:
            throw r1     // Catch:{ IOException -> 0x04d8 }
        L_0x04d8:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/writeData failed"
            goto L_0x0536
        L_0x04dc:
            r9 = r12
            X.1nK r9 = (X.C30861nK) r9     // Catch:{ all -> 0x055b }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x052f }
            r3.<init>(r4)     // Catch:{ IOException -> 0x052f }
            r3.beginObject()     // Catch:{ all -> 0x0525 }
            java.lang.String r0 = "collection_names"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x0525 }
            r0.beginArray()     // Catch:{ all -> 0x0525 }
            java.util.Set r0 = r9.A01     // Catch:{ all -> 0x0525 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0525 }
        L_0x04fb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0525 }
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ all -> 0x0525 }
            if (r0 == 0) goto L_0x04fb
            r3.value(r0)     // Catch:{ all -> 0x0525 }
            goto L_0x04fb
        L_0x050b:
            r3.endArray()     // Catch:{ all -> 0x0525 }
            android.util.JsonWriter r2 = r3.name(r2)     // Catch:{ all -> 0x0525 }
            long r0 = r9.A00     // Catch:{ all -> 0x0525 }
            r2.value(r0)     // Catch:{ all -> 0x0525 }
            r3.endObject()     // Catch:{ all -> 0x0525 }
            r3.flush()     // Catch:{ all -> 0x0525 }
            r3.close()     // Catch:{ IOException -> 0x052f }
        L_0x0520:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x055b }
            goto L_0x0541
        L_0x0525:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x052a }
            goto L_0x052e
        L_0x052a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x052f }
        L_0x052e:
            throw r1     // Catch:{ IOException -> 0x052f }
        L_0x052f:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/writeData failed"
            goto L_0x0536
        L_0x0533:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataOperationRequest/writeData failed"
        L_0x0536:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x055b }
            r2 = 0
            goto L_0x0541
        L_0x053b:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/writeData failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x055b }
        L_0x0541:
            r5.put(r6, r2)     // Catch:{ all -> 0x055b }
            java.lang.String r0 = "acked"
            X.2sg r2 = X.AnonymousClass3H0.A01(r5, r8, r0, r7)     // Catch:{ all -> 0x055b }
            java.lang.String r1 = "peer_messages"
            java.lang.String r0 = "PeerMessagesTable.ADD_MESSAGE"
            long r0 = r2.A08(r1, r0, r5)     // Catch:{ all -> 0x055b }
            r12.A1L = r0     // Catch:{ all -> 0x055b }
            long r0 = r12.A1L     // Catch:{ all -> 0x055b }
            r8.close()
            return r0
        L_0x055b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0560 }
            throw r1
        L_0x0560:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56302rl.A00(X.1mE):long");
    }

    public C30301mE A01(long j) {
        Cursor A0E;
        C626936e.A00();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE _id = ?", "PeerMessagesTable.SELECT_MESSAGE_BY_ID", C18260x0.A1b(j));
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B.close();
                return null;
            }
            C30301mE A02 = A02(A0E);
            A0E.close();
            A0B.close();
            return A02;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02de, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x07a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C30301mE A02(android.database.Cursor r11) {
        /*
            r10 = this;
            X.C626936e.A00()
            long r0 = X.C18270x1.A01(r11)
            java.lang.String r2 = "message_type"
            long r3 = X.AnonymousClass0x2.A0C(r11, r2)
            int r2 = (int) r3
            byte r8 = (byte) r2
            java.lang.String r2 = "key_remote_jid"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r11, r2)
            X.4uZ r5 = X.C18310x6.A0S(r4)
            if (r5 != 0) goto L_0x0038
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "peer-messages-store/read-peer-message-from-cursor/invalid remote jid "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " of msgType: "
            X.C18260x0.A0x(r0, r3, r8)
            r0 = 0
            return r0
        L_0x0038:
            java.lang.String r2 = "key_from_me"
            int r4 = X.AnonymousClass0x2.A04(r11, r2)
            r3 = 0
            r2 = 1
            boolean r4 = X.AnonymousClass000.A1U(r4, r2)
            java.lang.String r2 = "key_id"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r11, r2)
            X.2z0 r7 = X.AnonymousClass2z0.A05(r5, r2, r4)
            java.lang.String r6 = "timestamp"
            long r4 = X.AnonymousClass0x2.A0C(r11, r6)
            X.8qC r2 = r10.A01
            java.lang.Object r2 = r2.get()
            X.2YF r2 = (X.AnonymousClass2YF) r2
            X.34x r2 = r2.A00(r7, r8, r4)
            X.1mE r2 = (X.C30301mE) r2
            r2.A1L = r0
            java.lang.String r0 = "device_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r11, r0)
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            if (r0 == 0) goto L_0x0073
            r2.A00 = r0
        L_0x0073:
            java.lang.String r0 = "data"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r11, r0)
            boolean r0 = r2 instanceof X.C30891nN
            if (r0 == 0) goto L_0x00fc
            r4 = r2
            X.1nN r4 = (X.C30891nN) r4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r6 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x0792 }
            r6.beginObject()     // Catch:{ all -> 0x00f2 }
        L_0x008d:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ea
            java.lang.String r5 = r6.nextName()     // Catch:{ all -> 0x00f2 }
            int r1 = r5.hashCode()     // Catch:{ all -> 0x00f2 }
            r0 = 569764601(0x21f5eaf9, float:1.6664043E-18)
            if (r1 == r0) goto L_0x00b5
            r0 = 1150097001(0x448d1669, float:1128.7003)
            if (r1 != r0) goto L_0x00d8
            java.lang.String r0 = "requestType"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00d8
            int r0 = r6.nextInt()     // Catch:{ all -> 0x00f2 }
            r4.A00 = r0     // Catch:{ all -> 0x00f2 }
            goto L_0x008d
        L_0x00b5:
            java.lang.String r0 = "identifierSet"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00d8
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00f2 }
            r6.beginArray()     // Catch:{ all -> 0x00f2 }
        L_0x00c4:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x00f2 }
            r1.add(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x00c4
        L_0x00d2:
            r6.endArray()     // Catch:{ all -> 0x00f2 }
            r4.A01 = r1     // Catch:{ all -> 0x00f2 }
            goto L_0x008d
        L_0x00d8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "FMessagePeerDataOperationRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x00f2 }
            r1.append(r5)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x008d
        L_0x00ea:
            r6.endObject()     // Catch:{ all -> 0x00f2 }
            r6.close()     // Catch:{ IOException -> 0x0792 }
            goto L_0x0798
        L_0x00f2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0792 }
        L_0x00fb:
            throw r1     // Catch:{ IOException -> 0x0792 }
        L_0x00fc:
            boolean r0 = r2 instanceof X.AnonymousClass1OS
            if (r0 == 0) goto L_0x01ee
            r8 = r2
            X.1OS r8 = (X.AnonymousClass1OS) r8
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            android.util.JsonReader r9 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x01bc }
            r9.beginObject()     // Catch:{ all -> 0x01b2 }
        L_0x0118:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x01ab
            java.lang.String r5 = r9.nextName()     // Catch:{ all -> 0x01b2 }
            int r1 = r5.hashCode()     // Catch:{ all -> 0x01b2 }
            r0 = -957719559(0xffffffffc6ea5bf9, float:-29997.986)
            r6 = 2
            if (r1 == r0) goto L_0x016a
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x0146
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0198
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = r9.nextString()     // Catch:{ all -> 0x01b2 }
            r8.A00 = r0     // Catch:{ all -> 0x01b2 }
            goto L_0x0118
        L_0x0146:
            java.lang.String r0 = "requestResults"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0198
            r9.beginObject()     // Catch:{ all -> 0x01b2 }
        L_0x0152:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0194
            java.lang.String r1 = r9.nextName()     // Catch:{ all -> 0x01b2 }
            int r0 = r9.nextInt()     // Catch:{ all -> 0x01b2 }
            X.23E r0 = X.AnonymousClass23E.A00(r0)     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0152
            r4.put(r1, r0)     // Catch:{ all -> 0x01b2 }
            goto L_0x0152
        L_0x016a:
            java.lang.String r0 = "stickerResults"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0198
            r9.beginObject()     // Catch:{ all -> 0x01b2 }
        L_0x0176:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0194
            java.lang.String r5 = r9.nextName()     // Catch:{ all -> 0x01b2 }
            java.lang.String r0 = r9.nextString()     // Catch:{ all -> 0x01b2 }
            byte[] r1 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x01b2 }
            X.1EA r0 = X.AnonymousClass1EA.DEFAULT_INSTANCE     // Catch:{ all -> 0x01b2 }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ all -> 0x01b2 }
            X.1EA r0 = (X.AnonymousClass1EA) r0     // Catch:{ all -> 0x01b2 }
            r7.put(r5, r0)     // Catch:{ all -> 0x01b2 }
            goto L_0x0176
        L_0x0194:
            r9.endObject()     // Catch:{ all -> 0x01b2 }
            goto L_0x0118
        L_0x0198:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01b2 }
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x01b2 }
            r1.append(r5)     // Catch:{ all -> 0x01b2 }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x01b2 }
            goto L_0x0118
        L_0x01ab:
            r9.endObject()     // Catch:{ all -> 0x01b2 }
            r9.close()     // Catch:{ IOException -> 0x01bc }
            goto L_0x01c2
        L_0x01b2:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01b7 }
            goto L_0x01bb
        L_0x01b7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01bc }
        L_0x01bb:
            throw r1     // Catch:{ IOException -> 0x01bc }
        L_0x01bc:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01c2:
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r4)
        L_0x01c6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0798
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r6)
            java.lang.Object r5 = r0.getKey()
            java.util.Map r4 = r8.A00
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r7.containsKey(r5)
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r7.get(r5)
        L_0x01e4:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            r4.put(r5, r0)
            goto L_0x01c6
        L_0x01ec:
            r0 = 0
            goto L_0x01e4
        L_0x01ee:
            boolean r0 = r2 instanceof X.AnonymousClass1OP
            if (r0 == 0) goto L_0x024e
            r5 = r2
            X.1nL r5 = (X.C30871nL) r5
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r6 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x0249 }
            r6.beginObject()     // Catch:{ all -> 0x023f }
        L_0x0202:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x0237
            java.lang.String r4 = r6.nextName()     // Catch:{ all -> 0x023f }
            int r1 = r4.hashCode()     // Catch:{ all -> 0x023f }
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0225
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x0225
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x023f }
            r5.A00 = r0     // Catch:{ all -> 0x023f }
            goto L_0x0202
        L_0x0225:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x023f }
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x023f }
            r1.append(r4)     // Catch:{ all -> 0x023f }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x023f }
            goto L_0x0202
        L_0x0237:
            r6.endObject()     // Catch:{ all -> 0x023f }
            r6.close()     // Catch:{ IOException -> 0x0249 }
            goto L_0x0798
        L_0x023f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0244 }
            goto L_0x0248
        L_0x0244:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0249 }
        L_0x0248:
            throw r1     // Catch:{ IOException -> 0x0249 }
        L_0x0249:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData failed"
            goto L_0x0795
        L_0x024e:
            boolean r0 = r2 instanceof X.AnonymousClass1OQ
            if (r0 == 0) goto L_0x02eb
            r6 = r2
            X.1OQ r6 = (X.AnonymousClass1OQ) r6
            if (r1 == 0) goto L_0x0798
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0798
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ IOException -> 0x02e6 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x02e6 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ all -> 0x02df }
            r5.<init>(r4)     // Catch:{ all -> 0x02df }
            java.lang.String r7 = "FMessagePeerDataPlaceholderResendResponse/readData failed"
            r5.beginObject()     // Catch:{ all -> 0x02d8 }
        L_0x026c:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x02cd
            java.lang.String r8 = r5.nextName()     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = X.C162457s7.A0P(r8, r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x02d8 }
            r6.A00 = r0     // Catch:{ all -> 0x02d8 }
            goto L_0x026c
        L_0x0286:
            java.lang.String r0 = "peerDataOperationResults"
            boolean r0 = X.C162457s7.A0P(r8, r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x02c3
            r5.beginArray()     // Catch:{ all -> 0x02d8 }
            X.8U9 r8 = new X.8U9     // Catch:{ all -> 0x02d8 }
            r8.<init>()     // Catch:{ all -> 0x02d8 }
        L_0x0297:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x02b9
            java.lang.String r0 = r5.nextString()     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            byte[] r1 = X.AnonymousClass0x7.A1X(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            X.1Cm r0 = X.C21611Cm.DEFAULT_INSTANCE     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            X.1Cm r0 = (X.C21611Cm) r0     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            X.C162457s7.A0D(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            r8.add(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x02b4 }
            goto L_0x0297
        L_0x02b4:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)     // Catch:{ all -> 0x02d8 }
            goto L_0x0297
        L_0x02b9:
            java.util.List r0 = X.C159507lx.A0h(r8)     // Catch:{ all -> 0x02d8 }
            r6.A00 = r0     // Catch:{ all -> 0x02d8 }
            r5.endArray()     // Catch:{ all -> 0x02d8 }
            goto L_0x026c
        L_0x02c3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/readData unexpected name: "
            X.C18260x0.A0t(r0, r8, r1)     // Catch:{ all -> 0x02d8 }
            goto L_0x026c
        L_0x02cd:
            r5.endObject()     // Catch:{ all -> 0x02d8 }
            r5.close()     // Catch:{ all -> 0x02df }
            r4.close()     // Catch:{ IOException -> 0x02e6 }
            goto L_0x0798
        L_0x02d8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02da }
        L_0x02da:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x02df }
            throw r0     // Catch:{ all -> 0x02df }
        L_0x02df:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02e1 }
        L_0x02e1:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ IOException -> 0x02e6 }
            throw r0     // Catch:{ IOException -> 0x02e6 }
        L_0x02e6:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/readData failed"
            goto L_0x0795
        L_0x02eb:
            boolean r0 = r2 instanceof X.AnonymousClass1OR
            if (r0 == 0) goto L_0x03dc
            r8 = r2
            X.1OR r8 = (X.AnonymousClass1OR) r8
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            android.util.JsonReader r9 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x03aa }
            r9.beginObject()     // Catch:{ all -> 0x03a0 }
        L_0x0307:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0399
            java.lang.String r5 = r9.nextName()     // Catch:{ all -> 0x03a0 }
            int r1 = r5.hashCode()     // Catch:{ all -> 0x03a0 }
            r0 = -1808687704(0xffffffff94319da8, float:-8.9673085E-27)
            r6 = 2
            if (r1 == r0) goto L_0x0359
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x0335
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0386
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0386
            java.lang.String r0 = r9.nextString()     // Catch:{ all -> 0x03a0 }
            r8.A00 = r0     // Catch:{ all -> 0x03a0 }
            goto L_0x0307
        L_0x0335:
            java.lang.String r0 = "requestResults"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0386
            r9.beginObject()     // Catch:{ all -> 0x03a0 }
        L_0x0341:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0382
            java.lang.String r1 = r9.nextName()     // Catch:{ all -> 0x03a0 }
            int r0 = r9.nextInt()     // Catch:{ all -> 0x03a0 }
            X.23E r0 = X.AnonymousClass23E.A00(r0)     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0341
            r4.put(r1, r0)     // Catch:{ all -> 0x03a0 }
            goto L_0x0341
        L_0x0359:
            java.lang.String r0 = "linkPreviewResults"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0386
            r9.beginObject()     // Catch:{ all -> 0x03a0 }
        L_0x0364:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0382
            java.lang.String r5 = r9.nextName()     // Catch:{ all -> 0x03a0 }
            java.lang.String r0 = r9.nextString()     // Catch:{ all -> 0x03a0 }
            byte[] r1 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x03a0 }
            X.1Dj r0 = X.C21841Dj.DEFAULT_INSTANCE     // Catch:{ all -> 0x03a0 }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ all -> 0x03a0 }
            X.1Dj r0 = (X.C21841Dj) r0     // Catch:{ all -> 0x03a0 }
            r7.put(r5, r0)     // Catch:{ all -> 0x03a0 }
            goto L_0x0364
        L_0x0382:
            r9.endObject()     // Catch:{ all -> 0x03a0 }
            goto L_0x0307
        L_0x0386:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03a0 }
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x03a0 }
            r1.append(r5)     // Catch:{ all -> 0x03a0 }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x03a0 }
            goto L_0x0307
        L_0x0399:
            r9.endObject()     // Catch:{ all -> 0x03a0 }
            r9.close()     // Catch:{ IOException -> 0x03aa }
            goto L_0x03b0
        L_0x03a0:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x03a5 }
            goto L_0x03a9
        L_0x03a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03aa }
        L_0x03a9:
            throw r1     // Catch:{ IOException -> 0x03aa }
        L_0x03aa:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03b0:
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r4)
        L_0x03b4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0798
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r6)
            java.lang.Object r5 = r0.getKey()
            java.util.Map r4 = r8.A00
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r7.containsKey(r5)
            if (r0 == 0) goto L_0x03da
            java.lang.Object r0 = r7.get(r5)
        L_0x03d2:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            r4.put(r5, r0)
            goto L_0x03b4
        L_0x03da:
            r0 = 0
            goto L_0x03d2
        L_0x03dc:
            boolean r0 = r2 instanceof X.C30881nM
            if (r0 == 0) goto L_0x042a
            r6 = r2
            X.1nM r6 = (X.C30881nM) r6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r5 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x0425 }
            r5.beginObject()     // Catch:{ all -> 0x041b }
        L_0x03f0:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x041b }
            if (r0 == 0) goto L_0x0413
            java.lang.String r4 = r5.nextName()     // Catch:{ all -> 0x041b }
            int r1 = r4.hashCode()     // Catch:{ all -> 0x041b }
            r0 = 1518553996(0x5a834b8c, float:1.84781433E16)
            if (r1 != r0) goto L_0x03f0
            java.lang.String r0 = "security_notification_enabled"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x041b }
            if (r0 == 0) goto L_0x03f0
            boolean r0 = r5.nextBoolean()     // Catch:{ all -> 0x041b }
            r6.A00 = r0     // Catch:{ all -> 0x041b }
            goto L_0x03f0
        L_0x0413:
            r5.endObject()     // Catch:{ all -> 0x041b }
            r5.close()     // Catch:{ IOException -> 0x0425 }
            goto L_0x0798
        L_0x041b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0420 }
            goto L_0x0424
        L_0x0420:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0425 }
        L_0x0424:
            throw r1     // Catch:{ IOException -> 0x0425 }
        L_0x0425:
            r1 = move-exception
            java.lang.String r0 = "FMessageInitialSecurityNotificationSettingSync/readData failed"
            goto L_0x0795
        L_0x042a:
            boolean r0 = r2 instanceof X.AnonymousClass1nO
            if (r0 == 0) goto L_0x05c6
            r4 = r2
            X.1nO r4 = (X.AnonymousClass1nO) r4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r6 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x05c1 }
            r6.beginObject()     // Catch:{ all -> 0x05b7 }
        L_0x043e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x05af
            java.lang.String r1 = r6.nextName()     // Catch:{ all -> 0x05b7 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x05b7 }
            r5 = 2
            switch(r0) {
                case -1906067869: goto L_0x059e;
                case -1641051461: goto L_0x058e;
                case -1001078227: goto L_0x057d;
                case -945994952: goto L_0x056c;
                case -339500935: goto L_0x055b;
                case -50870532: goto L_0x054b;
                case 494573150: goto L_0x053a;
                case 500641162: goto L_0x0526;
                case 899130860: goto L_0x0515;
                case 990743644: goto L_0x0504;
                case 1098377542: goto L_0x04f3;
                case 1120684249: goto L_0x04e2;
                case 1161658856: goto L_0x04ce;
                case 1190721806: goto L_0x04be;
                case 1661853540: goto L_0x04ae;
                case 1836211977: goto L_0x049f;
                case 1894532689: goto L_0x0490;
                case 1939495049: goto L_0x0481;
                case 2011285592: goto L_0x0471;
                case 2104347627: goto L_0x0462;
                default: goto L_0x0450;
            }     // Catch:{ all -> 0x05b7 }
        L_0x0450:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "FMessageHistorySyncNotification/readData/unexpected name \""
            r5.append(r0)     // Catch:{ all -> 0x05b7 }
            r5.append(r1)     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r5, r0)     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0462:
            java.lang.String r0 = "chats_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A04 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0471:
            java.lang.String r0 = "reg_attempt_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0G = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0481:
            java.lang.String r0 = "media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0D = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0490:
            java.lang.String r0 = "latest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A06 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x049f:
            java.lang.String r0 = "file_length"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A05 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x04ae:
            java.lang.String r0 = "session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0H = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x04be:
            java.lang.String r0 = "enc_media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0C = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x04ce:
            java.lang.String r0 = "inline_payload"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            byte[] r0 = android.util.Base64.decode(r0, r5)     // Catch:{ all -> 0x05b7 }
            r4.A0I = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x04e2:
            java.lang.String r0 = "oldest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A08 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x04f3:
            java.lang.String r0 = "retries"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            int r0 = r6.nextInt()     // Catch:{ all -> 0x05b7 }
            r4.A02 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0504:
            java.lang.String r0 = "messages_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A07 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0515:
            java.lang.String r0 = "peer_data_request_session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0F = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x0526:
            java.lang.String r0 = "key_data"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            byte[] r0 = android.util.Base64.decode(r0, r5)     // Catch:{ all -> 0x05b7 }
            r4.A0J = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x053a:
            java.lang.String r0 = "sync_type"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            int r0 = r6.nextInt()     // Catch:{ all -> 0x05b7 }
            r4.A03 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x054b:
            java.lang.String r0 = "chunk_order"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            int r0 = r6.nextInt()     // Catch:{ all -> 0x05b7 }
            r4.A00 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x055b:
            java.lang.String r0 = "oldest_msg_id_to_sync"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A09 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x056c:
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            long r0 = r6.nextLong()     // Catch:{ all -> 0x05b7 }
            r4.A0A = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x057d:
            java.lang.String r0 = "progress"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            int r0 = r6.nextInt()     // Catch:{ all -> 0x05b7 }
            r4.A01 = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x058e:
            java.lang.String r0 = "direct_path"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0B = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x059e:
            java.lang.String r0 = "original-msg-id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x05b7 }
            r4.A0E = r0     // Catch:{ all -> 0x05b7 }
            goto L_0x043e
        L_0x05af:
            r6.endObject()     // Catch:{ all -> 0x05b7 }
            r6.close()     // Catch:{ IOException -> 0x05c1 }
            goto L_0x0798
        L_0x05b7:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x05bc }
            goto L_0x05c0
        L_0x05bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x05c1 }
        L_0x05c0:
            throw r1     // Catch:{ IOException -> 0x05c1 }
        L_0x05c1:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/readData failed"
            goto L_0x0795
        L_0x05c6:
            boolean r0 = r2 instanceof X.C30851nJ
            if (r0 == 0) goto L_0x0689
            r4 = r2
            X.1nJ r4 = (X.C30851nJ) r4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r7 = X.C30301mE.A00(r1)     // Catch:{ 1Sf | IOException -> 0x0684 }
            r7.beginObject()     // Catch:{ all -> 0x067a }
        L_0x05da:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x067a }
            if (r0 == 0) goto L_0x0672
            java.lang.String r6 = r7.nextName()     // Catch:{ all -> 0x067a }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x067a }
            r0 = -1807872114(0xffffffff943e0f8e, float:-9.595616E-27)
            r5 = 2
            if (r1 == r0) goto L_0x0643
            r0 = 3288564(0x322df4, float:4.60826E-39)
            if (r1 == r0) goto L_0x0607
            r0 = 1970709011(0x7576a213, float:3.126446E32)
            if (r1 != r0) goto L_0x065f
            java.lang.String r0 = "isNewlyGeneratedKey"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x067a }
            if (r0 == 0) goto L_0x065f
            boolean r0 = r7.nextBoolean()     // Catch:{ all -> 0x067a }
            r4.A01 = r0     // Catch:{ all -> 0x067a }
            goto L_0x05da
        L_0x0607:
            java.lang.String r0 = "keys"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x067a }
            if (r0 == 0) goto L_0x065f
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x067a }
            r7.beginArray()     // Catch:{ all -> 0x067a }
        L_0x0616:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x067a }
            if (r0 == 0) goto L_0x063c
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x067a }
            byte[] r1 = android.util.Base64.decode(r0, r5)     // Catch:{ all -> 0x067a }
            X.1BA r0 = X.AnonymousClass1BA.DEFAULT_INSTANCE     // Catch:{ all -> 0x067a }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ all -> 0x067a }
            X.1BA r0 = (X.AnonymousClass1BA) r0     // Catch:{ all -> 0x067a }
            android.util.Pair r0 = X.C60542yj.A00(r0)     // Catch:{ all -> 0x067a }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x067a }
            X.33J r1 = (X.AnonymousClass33J) r1     // Catch:{ all -> 0x067a }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x067a }
            X.2yj r0 = (X.C60542yj) r0     // Catch:{ all -> 0x067a }
            r6.put(r1, r0)     // Catch:{ all -> 0x067a }
            goto L_0x0616
        L_0x063c:
            r7.endArray()     // Catch:{ all -> 0x067a }
            r4.A1w(r6)     // Catch:{ all -> 0x067a }
            goto L_0x05da
        L_0x0643:
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x067a }
            if (r0 == 0) goto L_0x065f
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x067a }
            byte[] r1 = android.util.Base64.decode(r0, r5)     // Catch:{ all -> 0x067a }
            X.1A8 r0 = X.AnonymousClass1A8.DEFAULT_INSTANCE     // Catch:{ all -> 0x067a }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ all -> 0x067a }
            X.1A8 r0 = (X.AnonymousClass1A8) r0     // Catch:{ all -> 0x067a }
            r4.A00 = r0     // Catch:{ all -> 0x067a }
            goto L_0x05da
        L_0x065f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x067a }
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x067a }
            r1.append(r6)     // Catch:{ all -> 0x067a }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x067a }
            goto L_0x05da
        L_0x0672:
            r7.endObject()     // Catch:{ all -> 0x067a }
            r7.close()     // Catch:{ 1Sf | IOException -> 0x0684 }
            goto L_0x0798
        L_0x067a:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x067f }
            goto L_0x0683
        L_0x067f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 1Sf | IOException -> 0x0684 }
        L_0x0683:
            throw r1     // Catch:{ 1Sf | IOException -> 0x0684 }
        L_0x0684:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData failed"
            goto L_0x0795
        L_0x0689:
            boolean r0 = r2 instanceof X.C30841nI
            if (r0 == 0) goto L_0x0717
            r0 = r2
            X.1nI r0 = (X.C30841nI) r0
            java.util.Set r4 = r0.A00
            r4.clear()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r6 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x0713 }
            r6.beginObject()     // Catch:{ all -> 0x0709 }
        L_0x06a2:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0709 }
            if (r0 == 0) goto L_0x0701
            java.lang.String r5 = r6.nextName()     // Catch:{ all -> 0x0709 }
            int r1 = r5.hashCode()     // Catch:{ all -> 0x0709 }
            r0 = -816618934(0xffffffffcf53624a, float:-3.54643405E9)
            if (r1 != r0) goto L_0x06ef
            java.lang.String r0 = "key-ids"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0709 }
            if (r0 == 0) goto L_0x06ef
            r6.beginArray()     // Catch:{ all -> 0x0709 }
        L_0x06c0:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0709 }
            if (r0 == 0) goto L_0x06eb
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x0709 }
            byte[] r1 = X.AnonymousClass0x7.A1X(r0)     // Catch:{ all -> 0x0709 }
            X.1AH r0 = X.AnonymousClass1AH.DEFAULT_INSTANCE     // Catch:{ all -> 0x0709 }
            X.6cX r1 = X.C130786cX.A05(r0, r1)     // Catch:{ all -> 0x0709 }
            X.1AH r1 = (X.AnonymousClass1AH) r1     // Catch:{ all -> 0x0709 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0709 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x06c0
            X.8Lq r0 = r1.keyId_     // Catch:{ all -> 0x0709 }
            byte[] r1 = r0.A07()     // Catch:{ all -> 0x0709 }
            X.33J r0 = new X.33J     // Catch:{ all -> 0x0709 }
            r0.<init>(r1)     // Catch:{ all -> 0x0709 }
            r4.add(r0)     // Catch:{ all -> 0x0709 }
            goto L_0x06c0
        L_0x06eb:
            r6.endArray()     // Catch:{ all -> 0x0709 }
            goto L_0x06a2
        L_0x06ef:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0709 }
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0709 }
            r1.append(r5)     // Catch:{ all -> 0x0709 }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x0709 }
            goto L_0x06a2
        L_0x0701:
            r6.endObject()     // Catch:{ all -> 0x0709 }
            r6.close()     // Catch:{ IOException -> 0x0713 }
            goto L_0x0798
        L_0x0709:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x070e }
            goto L_0x0712
        L_0x070e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0713 }
        L_0x0712:
            throw r1     // Catch:{ IOException -> 0x0713 }
        L_0x0713:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData failed"
            goto L_0x0795
        L_0x0717:
            r4 = r2
            X.1nK r4 = (X.C30861nK) r4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0798
            android.util.JsonReader r7 = X.C30301mE.A00(r1)     // Catch:{ IOException -> 0x078e }
            r7.beginObject()     // Catch:{ all -> 0x0784 }
        L_0x0727:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0784 }
            if (r0 == 0) goto L_0x077d
            java.lang.String r5 = r7.nextName()     // Catch:{ all -> 0x0784 }
            int r1 = r5.hashCode()     // Catch:{ all -> 0x0784 }
            r0 = -1490290073(0xffffffffa72bfa67, float:-2.386676E-15)
            if (r1 == r0) goto L_0x074c
            r0 = 55126294(0x3492916, float:5.9115755E-37)
            if (r1 != r0) goto L_0x076b
            boolean r0 = r5.equals(r6)     // Catch:{ all -> 0x0784 }
            if (r0 == 0) goto L_0x076b
            long r0 = r7.nextLong()     // Catch:{ all -> 0x0784 }
            r4.A00 = r0     // Catch:{ all -> 0x0784 }
            goto L_0x0727
        L_0x074c:
            java.lang.String r0 = "collection_names"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0784 }
            if (r0 == 0) goto L_0x076b
            r7.beginArray()     // Catch:{ all -> 0x0784 }
        L_0x0757:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0784 }
            if (r0 == 0) goto L_0x0767
            java.util.Set r1 = r4.A01     // Catch:{ all -> 0x0784 }
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x0784 }
            r1.add(r0)     // Catch:{ all -> 0x0784 }
            goto L_0x0757
        L_0x0767:
            r7.endArray()     // Catch:{ all -> 0x0784 }
            goto L_0x0727
        L_0x076b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0784 }
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0784 }
            r1.append(r5)     // Catch:{ all -> 0x0784 }
            java.lang.String r0 = "\""
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x0784 }
            goto L_0x0727
        L_0x077d:
            r7.endObject()     // Catch:{ all -> 0x0784 }
            r7.close()     // Catch:{ IOException -> 0x078e }
            goto L_0x0798
        L_0x0784:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0789 }
            goto L_0x078d
        L_0x0789:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x078e }
        L_0x078d:
            throw r1     // Catch:{ IOException -> 0x078e }
        L_0x078e:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/readData failed"
            goto L_0x0795
        L_0x0792:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataOperationRequest/readData failed"
        L_0x0795:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0798:
            java.lang.String r0 = "acked"
            long r6 = X.AnonymousClass0x2.A0C(r11, r0)
            r4 = 1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x07a5
            r3 = 1
        L_0x07a5:
            r2.A01 = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56302rl.A02(android.database.Cursor):X.1mE");
    }

    public C30301mE A03(DeviceJid deviceJid, String str) {
        Cursor A0E;
        C626936e.A00();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A0B).A03;
            String[] A1a = AnonymousClass0x9.A1a();
            C18280x3.A0v(deviceJid, A1a);
            C18300x5.A1K(String.valueOf(1), str, A1a);
            A0E = r3.A0E("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE device_id = ? AND key_from_me = ? AND key_id = ?", "PeerMessagesStore.getPeerMessageByKey", A1a);
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B.close();
                return null;
            }
            C30301mE A02 = A02(A0E);
            A0E.close();
            A0B.close();
            return A02;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public List A04(byte b) {
        Cursor A0E;
        C626936e.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A0B).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1O(A1Y, b);
            A0E = r3.A0E("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ? ", "PeerMessagesTable.SELECT_MESSAGES_BY_MESSAGE_TYPE", A1Y);
            while (A0E.moveToNext()) {
                C30301mE A02 = A02(A0E);
                if (A02 != null) {
                    A0s.add(A02);
                }
            }
            A0E.close();
            A0B.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(DeviceJid deviceJid) {
        C626936e.A00();
        C85284Fq A0C = this.A00.A0C();
        try {
            ((AnonymousClass3H0) A0C).A03.A07("peer_messages", "device_id = ?", "PeerMessagesStore.deletePeerMessages", C18270x1.A1a(deviceJid));
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A06(List list) {
        C69833Yo Axl;
        if (list.size() != 0) {
            C626936e.A00();
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = String.valueOf(list.get(i));
            }
            C85284Fq A0C = this.A00.A0C();
            try {
                Axl = A0C.Axl();
                C71923ct r5 = new C71923ct(strArr, 975);
                while (r5.hasNext()) {
                    String[] A012 = C71923ct.A01(r5);
                    C56862sg r3 = ((AnonymousClass3H0) A0C).A03;
                    int length = A012.length;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18270x1.A1A("DELETE FROM peer_messages WHERE _id IN ( ", A0o, length);
                    r3.A0I(AnonymousClass000.A0X(" )", A0o), "PeerMessagesStore.deletePeerMessageById", A012);
                }
                Axl.A00();
                Axl.close();
                A0C.close();
                return;
            } catch (Throwable th) {
                try {
                    A0C.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
