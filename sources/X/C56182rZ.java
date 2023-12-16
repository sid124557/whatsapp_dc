package X;

import android.content.ContentValues;

/* renamed from: X.2rZ  reason: invalid class name and case insensitive filesystem */
public final class C56182rZ {
    public final AnonymousClass33p A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C66543Lv A03;
    public final C54762pF A04;
    public final C72303dV A05;
    public final C56652sL A06;
    public final C54572ow A07;
    public final C46492bi A08;
    public final AnonymousClass2LV A09;
    public final C45402Zx A0A;
    public final C55832qz A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.AnonymousClass2A8.A00(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C624134x A00(X.C95804uY r13, long r14) {
        /*
            r12 = this;
            r9 = 0
            X.C162457s7.A0J(r13, r9)
            X.3Lv r0 = r12.A03
            X.2qz r0 = r0.A2D
            X.2pp r7 = r0.A02
            java.lang.String r4 = "CachedMessageStore/getMessageBySortIdForChat/sortId"
            long r1 = android.os.SystemClock.uptimeMillis()
            X.3dV r0 = r7.A08     // Catch:{ all -> 0x0058 }
            X.4GK r8 = r0.get()     // Catch:{ all -> 0x0058 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0051 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x0051 }
            java.lang.String r10 = X.C58162uo.A0E     // Catch:{ all -> 0x0051 }
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0051 }
            X.AnonymousClass0x2.A1S(r3, r9, r14)     // Catch:{ all -> 0x0051 }
            X.2sm r0 = r7.A03     // Catch:{ all -> 0x0051 }
            long r5 = r0.A07(r13)     // Catch:{ all -> 0x0051 }
            X.C18270x1.A1R(r3, r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "GET_MESSAGE_BY_SORT_ID_SQL_FOR_CHAT"
            android.database.Cursor r5 = r11.A0E(r10, r0, r3)     // Catch:{ all -> 0x0051 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x004a }
            r3 = 0
            if (r0 == 0) goto L_0x003e
            X.34x r3 = r7.A02(r5, r13, r9)     // Catch:{ all -> 0x004a }
        L_0x003e:
            r5.close()     // Catch:{ all -> 0x0051 }
            r8.close()     // Catch:{ all -> 0x0058 }
            X.2ga r0 = r7.A05
            X.C49472ga.A00(r0, r4, r1)
            return r3
        L_0x004a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r3)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r3)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r3 = move-exception
            X.2ga r0 = r7.A05
            X.C49472ga.A00(r0, r4, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56182rZ.A00(X.4uY, long):X.34x");
    }

    public final void A03(C624134x r10) {
        AnonymousClass1RL r4;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        C56982ss r1 = this.A02;
        AnonymousClass2z0 r2 = r10.A1J;
        AnonymousClass31A A0A2 = r1.A0A(r2.A00, false);
        if ((A0A2 instanceof AnonymousClass1RL) && (r4 = (AnonymousClass1RL) A0A2) != null) {
            long j4 = r10.A1L;
            if (j4 != 1) {
                synchronized (A0A2) {
                    j = r4.A0U;
                }
                if (j < j4) {
                    this.A04.A02(r10);
                    if (r4.A07 != C372821q.GUEST) {
                        C18270x1.A0l(C18270x1.A03(this.A00), "newsletter_message_received", true);
                    }
                    synchronized (A0A2) {
                        if (r10.A1M > r4.A0V) {
                            r4.A0U = r10.A1L;
                            r4.A0V = r10.A1M;
                            r4.A0N = r10.A1L;
                            r4.A0O = r10.A1M;
                            r4.A0X = r10.A0K;
                            r4.A0d = r10;
                            r4.A0c = r10;
                        } else {
                            r4.A0d = null;
                        }
                        if (!(r2.A02 || (i2 = r10.A0D) == 16 || i2 == 18 || i2 == 17 || i2 == 9 || i2 == 10 || r10.A1o())) {
                            long j5 = r4.A0Q;
                            if (j5 < 100) {
                                j5 = 100;
                            }
                            int i3 = r4.A08;
                            int i4 = (int) (r10.A1M - j5);
                            if (i3 < i4) {
                                i3 = i4;
                            }
                            r4.A08 = i3;
                        }
                        C56652sL r5 = this.A06;
                        ContentValues A062 = AnonymousClass0x9.A06();
                        A062.put("_id", Long.valueOf(r4.A0W));
                        C56652sL.A00(A062, r4);
                        try {
                            i = r5.A01.A04(A062, r4);
                        } catch (Throwable unused) {
                            i = 0;
                        }
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("NewsletterMessageStore/updateNewsletterInfo/updated:");
                    A0o.append(i);
                    A0o.append(" newRowId:");
                    synchronized (A0A2) {
                        j2 = r4.A0N;
                    }
                    A0o.append(j2);
                    A0o.append(" newSortId:");
                    synchronized (A0A2) {
                        j3 = r4.A0O;
                    }
                    C18260x0.A1I(A0o, j3);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C624134x r5) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            X.3dV r0 = r4.A05     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            X.4Fq r3 = r0.A04()     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x0030 }
            r4.A01(r3, r5)     // Catch:{ all -> 0x0029 }
            r4.A02(r5)     // Catch:{ all -> 0x0029 }
            r2.A00()     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ all -> 0x0030 }
            r3.close()     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            boolean r0 = r5.A1o()     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            if (r0 != 0) goto L_0x0041
            X.2Zx r0 = r4.A0A     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            r0.A00(r5)     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            return
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
            throw r0     // Catch:{ SQLNonTransientException -> 0x003b, IllegalArgumentException -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message due to message constraints"
            goto L_0x003e
        L_0x003b:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message"
        L_0x003e:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56182rZ.A04(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C624134x r7) {
        /*
            r6 = this;
            r5 = 0
            X.3dV r0 = r6.A05     // Catch:{ Exception -> 0x0055 }
            X.4Fq r4 = r0.A04()     // Catch:{ Exception -> 0x0055 }
            X.3Yo r2 = r4.Axl()     // Catch:{ all -> 0x004e }
            X.3Lv r0 = r6.A03     // Catch:{ all -> 0x0047 }
            r3 = 1
            X.2xE r0 = r0.A0D(r7, r3)     // Catch:{ all -> 0x0047 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.A04     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "NewsletterMessageStore/failed to insert message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0047 }
            r2.close()     // Catch:{ all -> 0x004e }
            r4.close()     // Catch:{ Exception -> 0x0055 }
            return r5
        L_0x0025:
            r6.A01(r4, r7)     // Catch:{ all -> 0x0047 }
            r6.A02(r7)     // Catch:{ all -> 0x0047 }
            r6.A03(r7)     // Catch:{ all -> 0x0047 }
            r2.A00()     // Catch:{ all -> 0x0047 }
            r2.close()     // Catch:{ all -> 0x004e }
            r4.close()     // Catch:{ Exception -> 0x0055 }
            boolean r0 = r7.A1o()     // Catch:{ Exception -> 0x0055 }
            if (r0 != 0) goto L_0x0046
            X.2Zx r2 = r6.A0A     // Catch:{ Exception -> 0x0055 }
            X.3Wh r1 = r2.A02     // Catch:{ Exception -> 0x0055 }
            r0 = 16
            X.C69253Wh.A00(r1, r7, r2, r0)     // Catch:{ Exception -> 0x0055 }
        L_0x0046:
            return r3
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ Exception -> 0x0055 }
            throw r0     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56182rZ.A05(X.34x):boolean");
    }

    public final String[] A06(C95804uY r9, Long l, Long l2, long j) {
        if (l2 == null && l == null) {
            throw AnonymousClass001.A0c("Failed requirement.");
        }
        Long l3 = null;
        if (l != null) {
            l3 = l;
            if (l2 == null) {
                l2 = C18310x6.A0f(l.longValue(), j - 1);
            }
        } else if (l2 != null) {
            l3 = AnonymousClass0x9.A0n(l2.longValue(), j + 1);
        } else {
            l2 = null;
        }
        String[] A1a = AnonymousClass0x9.A1a();
        C56922sm.A02(this.A01, r9, A1a, 0);
        A1a[1] = String.valueOf(l3);
        A1a[2] = String.valueOf(l2);
        return A1a;
    }

    public final void A01(C85284Fq r8, C624134x r9) {
        C56862sg r4 = ((AnonymousClass3H0) r8).A03;
        C95814uZ r1 = r9.A1J.A00;
        if (r1 != null) {
            ContentValues A062 = AnonymousClass0x9.A06();
            C624134x.A0F(A062, r9);
            C56922sm.A00(A062, this.A01, r1);
            A062.put("server_message_id", Long.valueOf(r9.A1M));
            A062.put("comments_count", C18290x4.A0Z());
            AnonymousClass2SV A12 = r9.A12();
            if (A12 != null) {
                C18270x1.A0c(A062, "comments_count", A12.A00);
                A062.put("reaction_from_me", A12.A05);
                A062.put("reactions_from_me_ts", A12.A04);
                A062.put("extra_newsletter_tables", Long.valueOf(A12.A01));
                A062.put("extra_table_last_update_ts", Long.valueOf(A12.A02));
                A062.put("view_count", Long.valueOf(A12.A03));
            }
            r4.A0C("newsletter_message", "INSERT_OR_REPLACE_NEWSLETTER_MESSAGE", A062, 5);
            return;
        }
        throw AnonymousClass001.A0e("NewsletterMessageStore/getContentValuesForInsert invalid message");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C624134x r11) {
        /*
            r10 = this;
            X.4FP r0 = r11.A0L
            if (r0 == 0) goto L_0x0088
            X.2LV r0 = r10.A09
            r3 = 0
            r1 = 1
            X.3dV r0 = r0.A01     // Catch:{ all -> 0x0078 }
            X.4Fq r4 = r0.A04()     // Catch:{ all -> 0x0078 }
            X.3Yo r6 = r4.Axl()     // Catch:{ all -> 0x0071 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x006a }
            java.lang.String r8 = "newsletter_message_reaction"
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x006a }
            X.C624134x.A0Y(r11, r1, r3)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "DELETE_NEWSLETTER_MESSAGE_REACTION_FOR_MESSAGE"
            r9.A07(r8, r2, r0, r1)     // Catch:{ all -> 0x006a }
            X.4FP r1 = r11.A0L     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.data.NewsletterMessageReactions"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x006a }
            X.3Cz r1 = (X.C64313Cz) r1     // Catch:{ all -> 0x006a }
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x006a }
            X.C624134x.A0H(r7, r11)     // Catch:{ all -> 0x006a }
            java.util.Iterator r5 = r1.B4K()     // Catch:{ all -> 0x006a }
        L_0x003c:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x006a }
            X.1Hp r3 = (X.AnonymousClass1Hp) r3     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "reaction"
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x006a }
            r7.put(r1, r0)     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "reaction_count"
            long r0 = r3.A00     // Catch:{ all -> 0x006a }
            X.C18270x1.A0c(r7, r2, r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "NewsletterMessageReactionStore/insertOrReplaceNewsletterMessageReactions"
            r9.A09(r8, r0, r7)     // Catch:{ all -> 0x006a }
            goto L_0x003c
        L_0x005e:
            r6.A00()     // Catch:{ all -> 0x006a }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x006a }
            r6.close()     // Catch:{ all -> 0x0071 }
            r4.close()     // Catch:{ all -> 0x0078 }
            goto L_0x007d
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x007d:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "NewsletterMessageReactionStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0088:
            boolean r0 = r11 instanceof X.C30451mT
            if (r0 == 0) goto L_0x00a2
            X.1mT r11 = (X.C30451mT) r11
            java.util.List r1 = r11.A05
            X.C162457s7.A0D(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00a3
        L_0x009d:
            X.2ow r0 = r10.A07
            r0.A02(r11)
        L_0x00a2:
            return
        L_0x00a3:
            java.util.Iterator r5 = r1.iterator()
        L_0x00a7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009d
            X.2y4 r0 = X.AnonymousClass0x9.A0Z(r5)
            long r3 = r0.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56182rZ.A02(X.34x):void");
    }

    public C56182rZ(AnonymousClass33p r2, C56922sm r3, C56982ss r4, C66543Lv r5, C54762pF r6, C72303dV r7, C56652sL r8, C54572ow r9, C46492bi r10, AnonymousClass2LV r11, C45402Zx r12, C55832qz r13) {
        C18260x0.A0f(r3, r4, r8, r13, r9);
        C18260x0.A0g(r6, r7, r2, r5, r10);
        C162457s7.A0J(r11, 12);
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A0B = r13;
        this.A07 = r9;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A08 = r10;
        this.A0A = r12;
        this.A09 = r11;
    }
}
