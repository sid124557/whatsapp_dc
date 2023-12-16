package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.2i1  reason: invalid class name and case insensitive filesystem */
public class C50342i1 {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;

    public AnonymousClass1EF A00(AnonymousClass1EU r7) {
        AnonymousClass1EF r2;
        AnonymousClass1EC r1;
        AnonymousClass1ED r12;
        AnonymousClass1DG r13;
        AnonymousClass1EU r14;
        AnonymousClass1EA r15;
        AnonymousClass1EU A012 = C57312tR.A01((AnonymousClass1VX) this.A00.get(), r7);
        int i = A012.bitField0_;
        if (AnonymousClass000.A1S(i & 8)) {
            C21481Bz r16 = A012.contactMessage_;
            if (r16 == null) {
                r16 = C21481Bz.DEFAULT_INSTANCE;
            }
            if ((r16.bitField0_ & 4) == 0) {
                return null;
            }
            r2 = r16.contextInfo_;
        } else if ((i & 16) != 0) {
            C21991Dy r17 = A012.locationMessage_;
            if (r17 == null) {
                r17 = C21991Dy.DEFAULT_INSTANCE;
            }
            if ((r17.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
                return null;
            }
            r2 = r17.contextInfo_;
        } else if ((i & 65536) != 0) {
            C21921Dr r18 = A012.liveLocationMessage_;
            if (r18 == null) {
                r18 = C21921Dr.DEFAULT_INSTANCE;
            }
            if ((r18.bitField0_ & 512) == 0) {
                return null;
            }
            r2 = r18.contextInfo_;
        } else {
            if ((i & 32) != 0) {
                r1 = A012.extendedTextMessage_;
            } else if ((i & 4) != 0) {
                AnonymousClass1EE r19 = A012.imageMessage_;
                if (r19 == null) {
                    r19 = AnonymousClass1EE.DEFAULT_INSTANCE;
                }
                if ((r19.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
                    return null;
                }
                r2 = r19.contextInfo_;
            } else if ((i & 128) != 0) {
                AnonymousClass1E5 r110 = A012.audioMessage_;
                if (r110 == null) {
                    r110 = AnonymousClass1E5.DEFAULT_INSTANCE;
                }
                if ((r110.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                    return null;
                }
                r2 = r110.contextInfo_;
            } else {
                if ((i & 256) != 0) {
                    r12 = A012.videoMessage_;
                } else if ((i & 64) != 0) {
                    AnonymousClass1EB r111 = A012.documentMessage_;
                    if (r111 == null) {
                        r111 = AnonymousClass1EB.DEFAULT_INSTANCE;
                    }
                    if ((r111.bitField0_ & 65536) == 0) {
                        return null;
                    }
                    r2 = r111.contextInfo_;
                } else if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    AnonymousClass1C0 r112 = A012.contactsArrayMessage_;
                    if (r112 == null) {
                        r112 = AnonymousClass1C0.DEFAULT_INSTANCE;
                    }
                    if ((r112.bitField0_ & 2) == 0) {
                        return null;
                    }
                    r2 = r112.contextInfo_;
                } else {
                    if (AnonymousClass000.A1S(A012.bitField0_ & 2097152)) {
                        r15 = A012.stickerMessage_;
                    } else {
                        if ((32768 & i) != 0) {
                            AnonymousClass1CH r113 = A012.sendPaymentMessage_;
                            if (r113 == null) {
                                r113 = AnonymousClass1CH.DEFAULT_INSTANCE;
                            }
                            if ((r113.bitField0_ & 1) == 0) {
                                return null;
                            }
                            r14 = r113.noteMessage_;
                        } else if ((131072 & i) != 0) {
                            C21781Dd r114 = A012.requestPaymentMessage_;
                            if (r114 == null) {
                                r114 = C21781Dd.DEFAULT_INSTANCE;
                            }
                            if ((r114.bitField0_ & 1) == 0) {
                                return null;
                            }
                            r14 = r114.noteMessage_;
                        } else if ((16777216 & i) != 0) {
                            AnonymousClass1DU r115 = A012.productMessage_;
                            if (r115 == null) {
                                r115 = AnonymousClass1DU.DEFAULT_INSTANCE;
                            }
                            if ((r115.bitField0_ & 32) == 0) {
                                return null;
                            }
                            r2 = r115.contextInfo_;
                        } else if ((4194304 & i) != 0) {
                            C21821Dh r116 = A012.groupInviteMessage_;
                            if (r116 == null) {
                                r116 = C21821Dh.DEFAULT_INSTANCE;
                            }
                            if ((r116.bitField0_ & 64) == 0) {
                                return null;
                            }
                            r2 = r116.contextInfo_;
                        } else if ((8388608 & i) != 0) {
                            AnonymousClass1DH r117 = A012.templateButtonReplyMessage_;
                            if (r117 == null) {
                                r117 = AnonymousClass1DH.DEFAULT_INSTANCE;
                            }
                            if ((r117.bitField0_ & 4) == 0) {
                                return null;
                            }
                            r2 = r117.contextInfo_;
                        } else {
                            int i2 = A012.bitField1_;
                            if ((i2 & 512) != 0) {
                                return null;
                            }
                            if ((536870912 & i) != 0) {
                                C22001Dz r118 = A012.orderMessage_;
                                if (r118 == null) {
                                    r118 = C22001Dz.DEFAULT_INSTANCE;
                                }
                                if ((r118.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
                                    return null;
                                }
                                r2 = r118.contextInfo_;
                            } else if ((1073741824 & i) != 0) {
                                AnonymousClass1DC r119 = A012.listResponseMessage_;
                                if (r119 == null) {
                                    r119 = AnonymousClass1DC.DEFAULT_INSTANCE;
                                }
                                if ((r119.bitField0_ & 8) == 0) {
                                    return null;
                                }
                                r2 = r119.contextInfo_;
                            } else if ((i2 & 1) != 0) {
                                C21801Df r120 = A012.buttonsMessage_;
                                if (r120 == null) {
                                    r120 = C21801Df.DEFAULT_INSTANCE;
                                }
                                if ((r120.bitField0_ & 128) == 0) {
                                    return null;
                                }
                                r2 = r120.contextInfo_;
                            } else if ((i2 & 2) != 0) {
                                AnonymousClass1D0 r121 = A012.buttonsResponseMessage_;
                                if (r121 == null) {
                                    r121 = AnonymousClass1D0.DEFAULT_INSTANCE;
                                }
                                if ((r121.bitField0_ & 4) == 0) {
                                    return null;
                                }
                                r2 = r121.contextInfo_;
                            } else if ((i & 134217728) != 0) {
                                AnonymousClass1EL r122 = A012.listMessage_;
                                if (r122 == null) {
                                    r122 = AnonymousClass1EL.DEFAULT_INSTANCE;
                                }
                                if ((r122.bitField0_ & 64) == 0) {
                                    return null;
                                }
                                r2 = r122.contextInfo_;
                            } else if ((i2 & 8) != 0) {
                                AnonymousClass1ER r123 = A012.interactiveMessage_;
                                if (r123 == null) {
                                    r123 = AnonymousClass1ER.DEFAULT_INSTANCE;
                                }
                                if ((r123.bitField0_ & 128) == 0) {
                                    return null;
                                }
                                r2 = r123.contextInfo_;
                            } else {
                                if ((i2 & 64) != 0) {
                                    r13 = A012.pollCreationMessage_;
                                } else if ((32768 & i2) != 0) {
                                    r13 = A012.pollCreationMessageV2_;
                                } else if ((524288 & i2) != 0) {
                                    r13 = A012.pollCreationMessageV3_;
                                } else if ((i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    AnonymousClass1AV r124 = A012.requestPhoneNumberMessage_;
                                    if (r124 == null) {
                                        r124 = AnonymousClass1AV.DEFAULT_INSTANCE;
                                    }
                                    if ((r124.bitField0_ & 1) == 0) {
                                        return null;
                                    }
                                    r2 = r124.contextInfo_;
                                } else if ((i2 & 2097152) != 0) {
                                    r12 = A012.ptvMessage_;
                                } else if (A012.A0M()) {
                                    AnonymousClass1EI r125 = A012.templateMessage_;
                                    if (r125 == null) {
                                        r125 = AnonymousClass1EI.DEFAULT_INSTANCE;
                                    }
                                    if ((r125.bitField0_ & 8) == 0) {
                                        return null;
                                    }
                                    r2 = r125.contextInfo_;
                                } else {
                                    if (AnonymousClass000.A1S(A012.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
                                        AnonymousClass1EM r0 = A012.protocolMessage_;
                                        AnonymousClass1EM r126 = r0;
                                        if (r0 == null) {
                                            r0 = AnonymousClass1EM.DEFAULT_INSTANCE;
                                        }
                                        if ((r0.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                            if (r126 == null) {
                                                r126 = AnonymousClass1EM.DEFAULT_INSTANCE;
                                            }
                                            AnonymousClass1EU r02 = r126.editedMessage_;
                                            if (r02 == null) {
                                                r02 = AnonymousClass1EU.DEFAULT_INSTANCE;
                                            }
                                            r1 = r02.extendedTextMessage_;
                                        }
                                    }
                                    if ((i2 & 268435456) == 0) {
                                        return null;
                                    }
                                    C21761Db r127 = A012.eventMessage_;
                                    if (r127 == null) {
                                        r127 = C21761Db.DEFAULT_INSTANCE;
                                    }
                                    if ((r127.bitField0_ & 1) == 0) {
                                        return null;
                                    }
                                    r2 = r127.contextInfo_;
                                }
                                if (r13 == null) {
                                    r13 = AnonymousClass1DG.DEFAULT_INSTANCE;
                                }
                                if ((r13.bitField0_ & 8) == 0) {
                                    return null;
                                }
                                r2 = r13.contextInfo_;
                            }
                        }
                        if (r14 == null) {
                            r14 = AnonymousClass1EU.DEFAULT_INSTANCE;
                        }
                        if (AnonymousClass000.A1S(r14.bitField0_ & 32)) {
                            r1 = r14.extendedTextMessage_;
                        } else if (!AnonymousClass000.A1S(r14.bitField0_ & 2097152)) {
                            return null;
                        } else {
                            r15 = r14.stickerMessage_;
                        }
                    }
                    if (r15 == null) {
                        r15 = AnonymousClass1EA.DEFAULT_INSTANCE;
                    }
                    if ((r15.bitField0_ & 16384) == 0) {
                        return null;
                    }
                    r2 = r15.contextInfo_;
                }
                if (r12 == null) {
                    r12 = AnonymousClass1ED.DEFAULT_INSTANCE;
                }
                if ((r12.bitField0_ & 16384) == 0) {
                    return null;
                }
                r2 = r12.contextInfo_;
            }
            if (r1 == null) {
                r1 = AnonymousClass1EC.DEFAULT_INSTANCE;
            }
            if ((r1.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                return null;
            }
            r2 = r1.contextInfo_;
        }
        if (r2 == null) {
            return AnonymousClass1EF.DEFAULT_INSTANCE;
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0201, code lost:
        if (r1.renderLargerThumbnail_ == false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x020d, code lost:
        if (r1.showAdAttribution_ == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0219, code lost:
        if (r1.containsAutoReply_ == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0225, code lost:
        if (r1.clickToWhatsappCall_ == false) goto L_0x0227;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C55962rC r25, X.AnonymousClass1EF r26, X.C21851Dk r27, X.C624134x r28) {
        /*
            r24 = this;
            r1 = r27
            r2 = r28
            if (r27 == 0) goto L_0x0094
            int r0 = r1.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0094
            X.1D8 r4 = r1.botMetadata_
            if (r4 != 0) goto L_0x0012
            X.1D8 r4 = X.AnonymousClass1D8.DEFAULT_INSTANCE
        L_0x0012:
            int r0 = r4.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x002d
            X.1D7 r3 = r4.avatarMetadata_
            if (r3 != 0) goto L_0x001e
            X.1D7 r3 = X.AnonymousClass1D7.DEFAULT_INSTANCE
        L_0x001e:
            X.2mn r0 = new X.2mn
            r0.<init>(r3)
            java.lang.Object r3 = r2.A1K
            monitor-enter(r3)
            r2.A0W = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            int r0 = r4.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0094
            X.1DT r4 = r4.pluginMetadata_
            if (r4 != 0) goto L_0x0039
            X.1DT r4 = X.AnonymousClass1DT.DEFAULT_INSTANCE
        L_0x0039:
            r6 = 1
            X.C162457s7.A0J(r4, r6)
            int r5 = r4.bitField0_
            r0 = r5 & 1
            if (r0 == 0) goto L_0x02d3
            int r3 = r4.provider_
            if (r3 == r6) goto L_0x02cf
            r0 = 2
            if (r3 != r0) goto L_0x02cf
            X.22T r0 = X.AnonymousClass22T.GOOGLE
        L_0x004c:
            int r3 = r0.ordinal()
            r0 = 0
            if (r3 == r0) goto L_0x02cb
            X.21h r7 = X.C371921h.GOOGLE
        L_0x0055:
            r0 = r5 & 2
            if (r0 == 0) goto L_0x02c8
            int r3 = r4.pluginType_
            if (r3 == r6) goto L_0x02c4
            r0 = 2
            if (r3 != r0) goto L_0x02c4
            X.22S r0 = X.AnonymousClass22S.SEARCH
        L_0x0062:
            int r3 = r0.ordinal()
            r0 = 0
            if (r3 == r0) goto L_0x02c0
            X.21g r6 = X.C371821g.SEARCH
        L_0x006b:
            r0 = r5 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r8 = 0
            if (r0 == 0) goto L_0x02bd
            java.lang.String r9 = r4.thumbnailCdnUrl_
        L_0x0076:
            r0 = r5 & 8
            if (r0 == 0) goto L_0x02ba
            java.lang.String r10 = r4.profilePhotoCdnUrl_
        L_0x007c:
            r0 = r5 & 16
            if (r0 == 0) goto L_0x02b7
            java.lang.String r11 = r4.searchProviderUrl_
        L_0x0082:
            r0 = r5 & 32
            if (r0 == 0) goto L_0x008c
            int r0 = r4.referenceIndex_
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x008c:
            X.2nF r5 = new X.2nF
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.A1L(r5)
        L_0x0094:
            r6 = r25
            boolean r0 = r6.A0O
            r3 = r24
            if (r0 != 0) goto L_0x00cb
            if (r27 == 0) goto L_0x0284
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0284
            X.8qC r0 = r3.A06
            java.lang.Object r7 = r0.get()
            X.2xe r7 = (X.C59882xe) r7
            X.8qC r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.36E r0 = (X.AnonymousClass36E) r0
            int r5 = X.AnonymousClass29K.A00(r0, r2)
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0273
            X.8Lq r0 = r1.messageSecret_
            byte[] r4 = r0.A07()
            int r1 = r4.length
            r0 = 32
            if (r1 != r0) goto L_0x0429
            r2.A1a = r4
        L_0x00cb:
            r0 = r26
            if (r26 == 0) goto L_0x0428
            X.2z0 r7 = r6.A0D
            boolean r6 = r6.A0M
            int r4 = r0.bitField0_
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x00e3
            boolean r1 = r0.isSampled_
            if (r1 == 0) goto L_0x00e3
            r1 = 262144(0x40000, float:3.67342E-40)
            r2.A1B(r1)
        L_0x00e3:
            int r1 = r0.bitField0_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0159
            boolean r1 = r0.isForwarded_
            if (r1 == 0) goto L_0x0159
            r5 = 1
            r2.A1B(r5)
            int r4 = r0.bitField0_
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00fd
            int r1 = r0.forwardingScore_
            int r5 = java.lang.Math.max(r5, r1)
        L_0x00fd:
            r2.A06 = r5
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0135
            X.1D9 r5 = r0.forwardedNewsletterMessageInfo_
            if (r5 != 0) goto L_0x010a
            X.1D9 r5 = X.AnonymousClass1D9.DEFAULT_INSTANCE
        L_0x010a:
            int r1 = r5.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0135
            java.lang.String r4 = r5.newsletterJid_
            X.5Yx r1 = X.C95804uY.A03
            X.4uY r9 = r1.A01(r4)
            if (r9 == 0) goto L_0x0135
            int r4 = r5.bitField0_
            r1 = r4 & 2
            if (r1 == 0) goto L_0x0270
            int r8 = r5.serverMessageId_
        L_0x0122:
            r1 = r4 & 4
            if (r1 == 0) goto L_0x026c
            java.lang.String r5 = r5.newsletterName_
        L_0x0128:
            r1 = 3
            X.C162457s7.A0J(r5, r1)
            r4 = 0
            X.2mS r1 = new X.2mS
            r1.<init>(r9, r4, r5, r8)
            r2.A1T(r1)
        L_0x0135:
            int r4 = r0.bitField0_
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0159
            X.1AF r4 = r0.businessMessageForwardInfo_
            if (r4 != 0) goto L_0x0142
            X.1AF r4 = X.AnonymousClass1AF.DEFAULT_INSTANCE
        L_0x0142:
            int r1 = r4.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0159
            java.lang.String r1 = r4.businessOwnerJid_
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A08(r1)
            if (r5 == 0) goto L_0x0159
            r4 = 0
            X.2kg r1 = new X.2kg
            r1.<init>(r4, r5)
            r2.A1M(r1)
        L_0x0159:
            int r1 = r0.bitField0_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01c3
            int r1 = r0.expiration_
            r2.A1E(r1)
            int r1 = r0.bitField0_
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0178
            X.4uZ r1 = r7.A00
            boolean r1 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 == 0) goto L_0x0178
            long r4 = r0.ephemeralSettingTimestamp_
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r8
            X.C624134x.A0L(r2, r4)
        L_0x0178:
            X.1EP r1 = r0.disappearingMode_
            if (r1 != 0) goto L_0x017e
            X.1EP r1 = X.AnonymousClass1EP.DEFAULT_INSTANCE
        L_0x017e:
            X.22v r1 = r1.A0M()
            int r1 = r1.value
            r2.A00 = r1
            X.8qC r1 = r3.A00
            java.lang.Object r1 = r1.get()
            X.2sp r1 = (X.C56952sp) r1
            boolean r1 = X.C56952sp.A0G(r1)
            if (r1 == 0) goto L_0x01c3
            X.1EP r1 = r0.disappearingMode_
            if (r1 != 0) goto L_0x019a
            X.1EP r1 = X.AnonymousClass1EP.DEFAULT_INSTANCE
        L_0x019a:
            X.22w r4 = r1.A0N()
            r1 = 0
            int r1 = X.C18320x8.A02(r4, r1)
            int r1 = X.C18300x5.A02(r1)
            r2.A04 = r1
            X.1EP r1 = r0.disappearingMode_
            if (r1 != 0) goto L_0x01af
            X.1EP r1 = X.AnonymousClass1EP.DEFAULT_INSTANCE
        L_0x01af:
            boolean r4 = r1.initiatedByMe_
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            if (r1 == 0) goto L_0x01c3
            boolean r1 = r7.A02
            boolean r1 = X.AnonymousClass000.A1U(r4, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A0o = r1
        L_0x01c3:
            int r1 = r0.bitField0_
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0237
            X.1E4 r1 = r0.externalAdReply_
            if (r1 != 0) goto L_0x01cf
            X.1E4 r1 = X.AnonymousClass1E4.DEFAULT_INSTANCE
        L_0x01cf:
            java.lang.String r8 = r1.title_
            java.lang.String r9 = r1.body_
            int r5 = r1.mediaType_
            if (r5 == 0) goto L_0x0268
            r4 = 1
            if (r5 == r4) goto L_0x0264
            r4 = 2
            if (r5 != r4) goto L_0x0268
            X.22d r5 = X.AnonymousClass22d.VIDEO
        L_0x01df:
            X.22d r4 = X.AnonymousClass22d.IMAGE
            if (r5 != r4) goto L_0x025b
            r19 = 1
        L_0x01e5:
            java.lang.String r10 = r1.thumbnailUrl_
            java.lang.String r11 = r1.mediaUrl_
            X.8Lq r4 = r1.thumbnail_
            byte[] r17 = r4.A07()
            r18 = 0
            java.lang.String r12 = r1.sourceType_
            java.lang.String r13 = r1.sourceId_
            java.lang.String r14 = r1.sourceUrl_
            int r4 = r1.bitField0_
            r5 = r4 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0203
            boolean r5 = r1.renderLargerThumbnail_
            r20 = 1
            if (r5 != 0) goto L_0x0205
        L_0x0203:
            r20 = 0
        L_0x0205:
            r5 = r4 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x020f
            boolean r5 = r1.showAdAttribution_
            r21 = 1
            if (r5 != 0) goto L_0x0211
        L_0x020f:
            r21 = 0
        L_0x0211:
            r5 = r4 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x021b
            boolean r5 = r1.containsAutoReply_
            r22 = 1
            if (r5 != 0) goto L_0x021d
        L_0x021b:
            r22 = 0
        L_0x021d:
            r4 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0227
            boolean r4 = r1.clickToWhatsappCall_
            r23 = 1
            if (r4 != 0) goto L_0x0229
        L_0x0227:
            r23 = 0
        L_0x0229:
            java.lang.String r15 = r1.ctwaClid_
            java.lang.String r1 = r1.ref_
            X.2U8 r7 = new X.2U8
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.A1P(r7)
        L_0x0237:
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            X.8ya r1 = r0.mentionedJid_
            java.util.List r1 = X.C627336j.A0B(r4, r1)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r1.iterator()
        L_0x0247:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x02d6
            X.4uZ r5 = X.C18300x5.A0P(r7)
            r4 = 0
            X.3ZM r1 = new X.3ZM
            r1.<init>(r5, r4)
            r8.add(r1)
            goto L_0x0247
        L_0x025b:
            X.22d r4 = X.AnonymousClass22d.VIDEO
            r19 = 0
            if (r5 != r4) goto L_0x01e5
            r19 = 2
            goto L_0x01e5
        L_0x0264:
            X.22d r5 = X.AnonymousClass22d.IMAGE
            goto L_0x01df
        L_0x0268:
            X.22d r5 = X.AnonymousClass22d.NONE
            goto L_0x01df
        L_0x026c:
            java.lang.String r5 = ""
            goto L_0x0128
        L_0x0270:
            r8 = -1
            goto L_0x0122
        L_0x0273:
            boolean r0 = X.C57632tx.A00(r2)
            if (r0 == 0) goto L_0x00cb
            r0 = 0
            r7.A02(r0, r5)
            r0 = 66
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0284:
            boolean r0 = X.C57632tx.A00(r2)
            if (r0 == 0) goto L_0x00cb
            X.8qC r0 = r3.A08
            java.lang.Object r4 = r0.get()
            X.4FV r4 = (X.AnonymousClass4FV) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageContextInfoDeserializer"
            r1.append(r0)
            java.lang.String r0 = "/applyMessageSecret"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.8qC r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.36E r0 = (X.AnonymousClass36E) r0
            int r0 = X.AnonymousClass29K.A00(r0, r2)
            X.C59882xe.A00(r4, r1, r0)
            r0 = 66
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x02b7:
            r11 = r8
            goto L_0x0082
        L_0x02ba:
            r10 = r8
            goto L_0x007c
        L_0x02bd:
            r9 = r8
            goto L_0x0076
        L_0x02c0:
            X.21g r6 = X.C371821g.REELS
            goto L_0x006b
        L_0x02c4:
            X.22S r0 = X.AnonymousClass22S.REELS
            goto L_0x0062
        L_0x02c8:
            r6 = 0
            goto L_0x006b
        L_0x02cb:
            X.21h r7 = X.C371921h.BING
            goto L_0x0055
        L_0x02cf:
            X.22T r0 = X.AnonymousClass22T.BING
            goto L_0x004c
        L_0x02d3:
            r7 = 0
            goto L_0x0055
        L_0x02d6:
            X.8ya r1 = r0.groupMentions_
            java.util.Iterator r7 = r1.iterator()
        L_0x02dc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x02fc
            java.lang.Object r4 = r7.next()
            X.1B6 r4 = (X.AnonymousClass1B6) r4
            X.C18300x5.A1I(r4)
            java.lang.String r1 = r4.groupJid_
            X.4uZ r5 = X.C106405Yw.A04(r1)
            java.lang.String r4 = r4.groupSubject_
            X.3ZM r1 = new X.3ZM
            r1.<init>(r5, r4)
            r8.add(r1)
            goto L_0x02dc
        L_0x02fc:
            r2.A1g(r8)
            if (r6 == 0) goto L_0x0428
            java.lang.String r4 = r0.remoteJid_
            X.32V r1 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r7 = r1.A03(r4)
            int r4 = r0.bitField0_
            r1 = r4 & 4
            if (r1 == 0) goto L_0x03d3
            r1 = r4 & 2
            if (r1 == 0) goto L_0x0345
            java.lang.String r1 = r0.participant_
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            if (r1 != 0) goto L_0x0342
            r6 = 0
        L_0x031c:
            int r1 = r0.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x033d
            java.lang.String r1 = r0.remoteJid_
            X.4uZ r4 = X.C18310x6.A0S(r1)
        L_0x0328:
            if (r4 != 0) goto L_0x0330
            java.lang.String r1 = "messageutils/contextinfo/null remote jid"
            com.whatsapp.util.Log.d((java.lang.String) r1)
        L_0x0330:
            X.8qC r1 = r3.A04
            java.lang.Object r1 = r1.get()
            X.2sr r1 = (X.C56972sr) r1
            boolean r5 = r1.A0a(r6)
            goto L_0x0354
        L_0x033d:
            X.2z0 r1 = r2.A1J
            X.4uZ r4 = r1.A00
            goto L_0x0328
        L_0x0342:
            com.whatsapp.jid.UserJid r6 = r1.userJid
            goto L_0x031c
        L_0x0345:
            X.4uZ r1 = r2.A0n()
            if (r1 != 0) goto L_0x034f
            X.2z0 r1 = r2.A1J
            X.4uZ r1 = r1.A00
        L_0x034f:
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A03(r1)
            goto L_0x031c
        L_0x0354:
            X.1EU r9 = r0.quotedMessage_     // Catch:{ 24P | 24W -> 0x03cc }
            if (r9 != 0) goto L_0x035a
            X.1EU r9 = X.AnonymousClass1EU.DEFAULT_INSTANCE     // Catch:{ 24P | 24W -> 0x03cc }
        L_0x035a:
            java.lang.String r1 = r0.stanzaId_     // Catch:{ 24P | 24W -> 0x03cc }
            X.2z0 r11 = X.AnonymousClass2z0.A05(r4, r1, r5)     // Catch:{ 24P | 24W -> 0x03cc }
            X.8qC r1 = r3.A00     // Catch:{ 24P | 24W -> 0x03cc }
            java.lang.Object r8 = r1.get()     // Catch:{ 24P | 24W -> 0x03cc }
            X.1VX r8 = (X.AnonymousClass1VX) r8     // Catch:{ 24P | 24W -> 0x03cc }
            X.8qC r1 = r3.A07     // Catch:{ 24P | 24W -> 0x03cc }
            java.lang.Object r7 = r1.get()     // Catch:{ 24P | 24W -> 0x03cc }
            X.30C r7 = (X.AnonymousClass30C) r7     // Catch:{ 24P | 24W -> 0x03cc }
            X.8qC r1 = r3.A01     // Catch:{ 24P | 24W -> 0x03cc }
            java.lang.Object r4 = r1.get()     // Catch:{ 24P | 24W -> 0x03cc }
            X.2ss r4 = (X.C56982ss) r4     // Catch:{ 24P | 24W -> 0x03cc }
            X.4uZ r1 = r11.A00     // Catch:{ 24P | 24W -> 0x03cc }
            boolean r1 = X.C624835f.A04(r7, r4, r8, r1, r9)     // Catch:{ 24P | 24W -> 0x03cc }
            if (r1 != 0) goto L_0x03bd
            r12 = 0
            X.C18260x0.A0O(r9, r11)     // Catch:{ 24P | 24W -> 0x03cc }
            X.2dX r8 = new X.2dX     // Catch:{ 24P | 24W -> 0x03cc }
            r10 = r9
            r8.<init>(r9, r10, r11, r12)     // Catch:{ 24P | 24W -> 0x03cc }
            r8.A04 = r6     // Catch:{ 24P | 24W -> 0x03cc }
            r1 = 1
            r8.A0I = r1     // Catch:{ 24P | 24W -> 0x03cc }
            X.2rC r4 = r8.A01()     // Catch:{ 24P | 24W -> 0x03cc }
            X.8qC r1 = r3.A03     // Catch:{ 24P | 24W -> 0x03cc }
            java.lang.Object r1 = r1.get()     // Catch:{ 24P | 24W -> 0x03cc }
            X.3Le r1 = (X.C66383Le) r1     // Catch:{ 24P | 24W -> 0x03cc }
            X.34x r4 = r1.A00(r4)     // Catch:{ 24P | 24W -> 0x03cc }
            if (r5 != 0) goto L_0x03a7
            if (r6 == 0) goto L_0x03c4
            r4.A1J(r6)     // Catch:{ 24P | 24W -> 0x03cc }
        L_0x03a7:
            byte r1 = r4.A1I     // Catch:{ 24P | 24W -> 0x03cc }
            if (r1 != 0) goto L_0x03b5
            java.lang.String r1 = r4.A13()     // Catch:{ 24P | 24W -> 0x03cc }
            if (r1 != 0) goto L_0x03b5
            java.lang.String r1 = r4.A15     // Catch:{ 24P | 24W -> 0x03cc }
            if (r1 == 0) goto L_0x03e6
        L_0x03b5:
            r1 = 2
            r4.A1H(r1)     // Catch:{ 24P | 24W -> 0x03cc }
            r2.A1R(r4)     // Catch:{ 24P | 24W -> 0x03cc }
            goto L_0x03e6
        L_0x03bd:
            r1 = 18
            X.24W r1 = X.AnonymousClass24W.A00(r1)     // Catch:{ 24P | 24W -> 0x03cc }
            goto L_0x03cb
        L_0x03c4:
            java.lang.String r1 = "null jid not from me"
            X.24P r1 = X.AnonymousClass24P.A00(r1)     // Catch:{ 24P | 24W -> 0x03cc }
        L_0x03cb:
            throw r1     // Catch:{ 24P | 24W -> 0x03cc }
        L_0x03cc:
            r4 = move-exception
            java.lang.String r1 = "MessageUtils/buildContextInfo/error quoted message was malformed, exception="
            com.whatsapp.util.Log.w(r1, r4)
            goto L_0x03e6
        L_0x03d3:
            r1 = r4 & 8
            if (r1 == 0) goto L_0x03e6
            if (r7 == 0) goto L_0x03e6
            java.lang.String r6 = r0.groupSubject_
            java.lang.String r1 = r0.parentGroupJid_
            r4 = 0
            X.1nT r1 = X.C385328b.A00(r7, r6, r1, r4)
            r2.A1R(r1)
        L_0x03e6:
            X.8qC r4 = r3.A00
            java.lang.Object r3 = r4.get()
            X.2sp r3 = (X.C56952sp) r3
            r1 = 508(0x1fc, float:7.12E-43)
            r3.A0X(r1)
            java.lang.Object r4 = r4.get()
            X.2sp r4 = (X.C56952sp) r4
            r3 = 5869(0x16ed, float:8.224E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r4.A0Y(r1, r3)
            if (r1 == 0) goto L_0x0428
            int r3 = r0.bitField0_
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0428
            r1 = 64
            long r5 = r2.A1P
            long r3 = (long) r1
            long r5 = r5 | r3
            r2.A1P = r5
            X.1AG r1 = r0.dataSharingContext_
            if (r1 != 0) goto L_0x0418
            X.1AG r1 = X.AnonymousClass1AG.DEFAULT_INSTANCE
        L_0x0418:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0428
            boolean r1 = r1.showMmDisclosure_
            X.2jD r0 = new X.2jD
            r0.<init>(r1)
            r2.A1O(r0)
        L_0x0428:
            return
        L_0x0429:
            r0 = 1
            r7.A02(r0, r5)
            r0 = 67
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50342i1.A01(X.2rC, X.1EF, X.1Dk, X.34x):void");
    }

    public C50342i1(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9) {
        this.A00 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A03 = r8;
        this.A02 = r9;
    }
}
