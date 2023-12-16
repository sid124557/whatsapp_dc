package X;

/* renamed from: X.2ff  reason: invalid class name and case insensitive filesystem */
public final class C48902ff {
    public final C58202us A00;
    public final AnonymousClass66R A01 = C154517dI.A01(AnonymousClass40N.A00);
    public final AnonymousClass66R A02 = C154517dI.A01(AnonymousClass40O.A00);

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C54002o1 A00(com.whatsapp.jid.UserJid r23) {
        /*
            r22 = this;
            r0 = 0
            r10 = r23
            X.C162457s7.A0J(r10, r0)
            r3 = r22
            X.66R r1 = r3.A02
            java.lang.Object r0 = r1.getValue()
            X.0Qw r0 = (X.C04840Qw) r0
            java.lang.Object r0 = r0.A04(r10)
            r8 = 0
            if (r0 != 0) goto L_0x00c2
            X.66R r0 = r3.A01
            java.lang.Object r2 = r0.getValue()
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.Object r2 = r2.get(r10)
            X.2o1 r2 = (X.C54002o1) r2
            if (r2 == 0) goto L_0x0028
            return r2
        L_0x0028:
            X.2us r2 = r3.A00
            r7 = 0
            X.1RI r2 = r2.A00
            X.4GK r2 = r2.get()
            r3 = r2
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x00bb }
            X.2sg r6 = r3.A03     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "SELECT tag, name, is_default, attributes, description, category, prompts, behavior_graph, persona_id, commands_description, commands FROM wa_bot_profiles WHERE jid= ?"
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00bb }
            X.C18280x3.A0w(r10, r4, r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "GET_BOT_PROFILE_BY_JID"
            android.database.Cursor r9 = r6.A0E(r5, r3, r4)     // Catch:{ all -> 0x00bb }
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x00b4 }
            r3 = 0
            if (r4 == 0) goto L_0x0096
            java.lang.String r3 = "tag"
            int r11 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "name"
            int r12 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "is_default"
            int r13 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "attributes"
            int r14 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "description"
            int r15 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "category"
            int r16 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "prompts"
            int r17 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "behavior_graph"
            int r18 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "persona_id"
            int r19 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "commands_description"
            int r20 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "commands"
            int r21 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00b4 }
            X.2o1 r3 = X.C58202us.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00b4 }
        L_0x0096:
            r9.close()     // Catch:{ all -> 0x00bb }
            r2.close()
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r10, r3)
            return r3
        L_0x00a8:
            java.lang.Object r1 = r1.getValue()
            X.0Qw r1 = (X.C04840Qw) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A08(r10, r0)
            return r8
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x00c2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48902ff.A00(com.whatsapp.jid.UserJid):X.2o1");
    }

    public C48902ff(C58202us r2) {
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ec, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        X.AnonymousClass2A8.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A01(java.util.Collection r26) {
        /*
            r25 = this;
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            r3 = r25
            X.66R r10 = r3.A01
            java.lang.Object r0 = r10.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Set r0 = r0.keySet()
            X.C162457s7.A0D(r0)
            r11 = r26
            java.util.Set r9 = X.C73723fy.A0Q(r11, r0)
            boolean r0 = X.C18310x6.A1X(r9)
            if (r0 == 0) goto L_0x012a
            X.2us r7 = r3.A00
            r6 = 0
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00fb
            java.util.ArrayList r5 = X.C73783g4.A0c(r9)
            java.util.Iterator r4 = r9.iterator()
        L_0x0036:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            X.C18270x1.A1L(r5, r4)
            goto L_0x0036
        L_0x0040:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r5 = r5.toArray(r0)
            X.1RI r0 = r7.A00
            X.4GK r0 = r0.get()
            r4 = 975(0x3cf, float:1.366E-42)
            X.3ct r8 = new X.3ct     // Catch:{ all -> 0x00f1 }
            r8.<init>(r5, r4)     // Catch:{ all -> 0x00f1 }
        L_0x0053:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r4 == 0) goto L_0x00f8
            java.lang.String[] r12 = X.C71923ct.A01(r8)     // Catch:{ all -> 0x00f1 }
            r4 = r0
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x00f1 }
            X.2sg r7 = r4.A03     // Catch:{ all -> 0x00f1 }
            int r6 = r12.length     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = "SELECT jid, tag, name, is_default, attributes, description, category, prompts, behavior_graph, persona_id, commands_description, commands FROM wa_bot_profiles WHERE jid IN "
            X.C57212tH.A02(r4, r5, r6)     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = "GET_BOT_PROFILES_BY_JIDS"
            android.database.Cursor r12 = r7.A0E(r5, r4, r12)     // Catch:{ all -> 0x00f1 }
            X.C162457s7.A0H(r12)     // Catch:{ all -> 0x00ea }
            int r7 = X.AnonymousClass0x9.A01(r12)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "tag"
            int r14 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "name"
            int r15 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "is_default"
            int r16 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "attributes"
            int r17 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "description"
            int r18 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "category"
            int r19 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "prompts"
            int r20 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "behavior_graph"
            int r21 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "persona_id"
            int r22 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "commands_description"
            int r23 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "commands"
            int r24 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
        L_0x00c3:
            boolean r4 = r12.moveToNext()     // Catch:{ all -> 0x00ea }
            if (r4 == 0) goto L_0x00e5
            java.lang.String r6 = X.C18320x8.A0c(r12, r7)     // Catch:{ all -> 0x00ea }
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass32Y.A08(r6)     // Catch:{ all -> 0x00ea }
            if (r13 != 0) goto L_0x00dd
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "BotProfileStore/readBotProfilesFromCursor invalid jid="
            X.C18260x0.A0r(r4, r6, r5)     // Catch:{ all -> 0x00ea }
            goto L_0x00c3
        L_0x00dd:
            X.2o1 r4 = X.C58202us.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00ea }
            r1.put(r13, r4)     // Catch:{ all -> 0x00ea }
            goto L_0x00c3
        L_0x00e5:
            r12.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x0053
        L_0x00ea:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r12, r2)     // Catch:{ all -> 0x00f1 }
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r0, r2)
            throw r1
        L_0x00f8:
            r0.close()
        L_0x00fb:
            java.util.Iterator r6 = r9.iterator()
        L_0x00ff:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r5 = r6.next()
            java.lang.Object r4 = r1.get(r5)
            if (r4 == 0) goto L_0x011c
            java.lang.Object r0 = r10.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r5, r4)
            r2.put(r5, r4)
            goto L_0x00ff
        L_0x011c:
            X.66R r0 = r3.A02
            java.lang.Object r4 = r0.getValue()
            X.0Qw r4 = (X.C04840Qw) r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A08(r5, r0)
            goto L_0x00ff
        L_0x012a:
            java.util.Iterator r3 = r11.iterator()
        L_0x012e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r1 = r3.next()
            boolean r0 = r9.contains(r1)
            if (r0 != 0) goto L_0x012e
            java.lang.Object r0 = r10.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x012e
            r2.put(r1, r0)
            goto L_0x012e
        L_0x014e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48902ff.A01(java.util.Collection):java.util.Map");
    }
}
