package com.facebook.exoplayer.formatevaluator.configuration;

import X.AnonymousClass707;
import X.AnonymousClass8L1;
import X.C141906wK;
import X.C152587Zl;
import X.C162457s7;
import X.C18260x0;
import android.net.ConnectivityManager;
import java.util.Locale;

public final class AbrContextAwareConfiguration {
    public final AnonymousClass8L1 abrSetting;
    public final AnonymousClass707 connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGClips;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final C152587Zl playbackPreferences;

    public final int getHighBwRiskConfPct(C141906wK r3) {
        int i;
        int i2;
        int i3;
        C162457s7.A0J(r3, 0);
        if (this.isLive) {
            C141906wK r1 = C141906wK.ULTRA_LOW_LATENCY;
            AnonymousClass8L1 r0 = this.abrSetting;
            if (r3 == r1) {
                return r0.liveHighBwRiskConfPctUltraLowLatency;
            }
            return r0.liveHighBwRiskConfPct;
        } else if (this.isBackgroundPrefetch && (i3 = this.abrSetting.backgroundPrefetchHighBwRiskConfPct) > 0) {
            return i3;
        } else {
            if (this.isSponsored) {
                AnonymousClass8L1 r12 = this.abrSetting;
                int i4 = r12.adHighBwRiskConfPct;
                if (i4 > 0) {
                    return i4;
                }
                if (this.isPrefetch) {
                    i2 = r12.adHighBwRiskConfPctPrefetch;
                } else {
                    i2 = r12.adHighBwRiskConfPctOnScreen;
                }
                if (i2 > 0) {
                    return i2;
                }
            }
            if (!this.isPrefetch || !this.enableForegroundPrefetchQualityExperimentation || (i = this.abrSetting.foregroundPrefetchHighBwRiskConfPct) <= 0) {
                return this.abrSetting.highBwRiskConfPct;
            }
            return i;
        }
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, C141906wK r4) {
        int i2;
        C162457s7.A0J(r4, 1);
        if (r4 != C141906wK.ULTRA_LOW_LATENCY || (i2 = this.abrSetting.ultraLowLatencyAdjustedLowestQualityIndex) < 0) {
            return i - 1;
        }
        return Math.min(i2, i - 1);
    }

    public final double getRiskAdjFactor(boolean z, C141906wK r4) {
        C162457s7.A0J(r4, 1);
        boolean z2 = this.isLive;
        if (z) {
            AnonymousClass8L1 r0 = this.abrSetting;
            if (z2) {
                return r0.liveAudioRiskAdjFactor;
            }
            return r0.audioRiskAdjFactor;
        } else if (!z2) {
            return this.abrSetting.riskAdjFactor;
        } else {
            if (r4 == C141906wK.LOW_LATENCY) {
                return this.abrSetting.liveUserLowLatencyRiskAdjFactor;
            }
            C141906wK r1 = C141906wK.ULTRA_LOW_LATENCY;
            AnonymousClass8L1 r02 = this.abrSetting;
            if (r4 == r1) {
                return r02.liveUserUltraLowLatencyRiskAdjFactor;
            }
            return r02.liveRiskAdjFactor;
        }
    }

    public final double getSystemicRiskFactor(boolean z, C141906wK r7) {
        C162457s7.A0J(r7, 1);
        boolean z2 = this.isLive;
        if (z) {
            AnonymousClass8L1 r0 = this.abrSetting;
            if (z2) {
                return r0.liveSystemicRiskAudioFactor;
            }
            return r0.systemicRiskAudioFactor;
        } else if (!z2) {
            if (this.isIGClips) {
                double d = this.abrSetting.systemRiskFactorForIgClips;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.systemicRiskFactor;
        } else if (r7 == C141906wK.LOW_LATENCY) {
            return this.abrSetting.liveUserLowLatencySystemicRiskFactor;
        } else {
            C141906wK r1 = C141906wK.ULTRA_LOW_LATENCY;
            AnonymousClass8L1 r02 = this.abrSetting;
            if (r7 == r1) {
                return r02.liveUserUltraLowLatencySystemicRiskFactor;
            }
            return r02.liveSystemicRiskFactor;
        }
    }

    public final double getVirtualBufferPercent(C141906wK r3) {
        C162457s7.A0J(r3, 0);
        if (r3 == C141906wK.LOW_LATENCY) {
            return this.abrSetting.liveLSBVirtualBufferPercent;
        }
        if (r3 == C141906wK.ULTRA_LOW_LATENCY) {
            return this.abrSetting.liveULSBVirtualBufferPercent;
        }
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveVirtualBufferPercent;
        }
        return r0.virtualBufferPercent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSystemicRiskIBR(boolean r4, X.AnonymousClass7FJ r5) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x000e
            boolean r1 = r3.isLive
            X.8L1 r0 = r3.abrSetting
            if (r1 == 0) goto L_0x000f
            boolean r0 = r0.liveSystemicRiskAudioEnableABR
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            return r2
        L_0x000f:
            boolean r0 = r0.systemicRiskAudioEnableABR
            if (r0 == 0) goto L_0x000d
            if (r5 == 0) goto L_0x000d
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x000d
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.isSystemicRiskIBR(boolean, X.7FJ):boolean");
    }

    public final boolean shouldUseServerSideBWE(C141906wK r3) {
        C162457s7.A0J(r3, 0);
        if (this.isLive) {
            if (r3 == C141906wK.ULTRA_LOW_LATENCY) {
                return this.abrSetting.useSSBweForUltraLowLatency;
            }
            if (r3 == C141906wK.LOW_LATENCY) {
                return this.abrSetting.useSSBweForLowLatency;
            }
            if (r3 == C141906wK.REGULAR_LATENCY) {
                return this.abrSetting.useSSBweForRegularLatency;
            }
        }
        return false;
    }

    private final boolean getEnableInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveEnableInitialBitrateBoosterByNetworkQuality;
        }
        return r0.enableInitialBitrateBoosterByNetworkQuality;
    }

    private final float getInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveInitialBitrateBoosterByNetworkQuality;
        }
        return r0.initialBitrateBoosterByNetworkQuality;
    }

    public final boolean enableAndroidAPIBitrate() {
        return this.abrSetting.enableAndroidAPIBitrate;
    }

    public final boolean enableConfRiskBwCache() {
        return this.abrSetting.enableConfRiskBwCache;
    }

    public final boolean enableMosOverride() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.enableMosOverrideLive;
        }
        return r0.enableMosOverride;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        if (this.isLive || !z || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCacheOverride;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        if (this.isLive || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCachePrefetchOverride;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMos() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMosForPrefetch() {
        return false;
    }

    public final boolean enableXPlatBweParity() {
        return this.abrSetting.enableXPlatBweParity;
    }

    public final long getAbrDurationForIntentional() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAbrDurationForIntentional;
        }
        return r0.abrDurationForIntentional;
    }

    public final boolean getAllowAbrUpToWatchableMosInLowBuffer() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAllowAbrUpToWatchableMosInLowBuffer;
        }
        return r0.allowAbrUpToWatchableMosInLowBuffer;
    }

    public final boolean getAllowAudioFormatsLowerThanDefault() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAllowAudioFormatsLowerThanDefault;
        }
        return r0.allowAudioFormatsLowerThanDefault;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return this.abrSetting.androidBandwidthFallbackNumberOfSamples;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitIntentionalKbps;
        }
        return 0;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitUnintentionalKbps;
        }
        return 0;
    }

    public final float getAudioBandwidthFraction() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAudioBandwidthFractionCell;
        }
        return r0.audioBandwidthFractionCell;
    }

    public final int getAudioMaxInitialBitrate() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAudioMaxInitialBitrate;
        }
        return r0.audioMaxInitialBitrate;
    }

    public final float getAudioPrefetchBandwidthFraction() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAudioPrefetchBandwidthFraction;
        }
        return r0.audioPrefetchBandwidthFraction;
    }

    public final boolean getAvoidUsingDefaultQualityForIdealWhenNoBWEstimate() {
        return this.abrSetting.liveAvoidUseDefault;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return this.abrSetting.bwWeightLimitForBWEDampening;
    }

    public final float getBandwidthMultiplier() {
        boolean z;
        C152587Zl r1 = this.playbackPreferences;
        synchronized (r1) {
            z = r1.A05;
        }
        if (!z || !this.isIGStory) {
            return 1.0f;
        }
        return this.abrSetting.bandwidthMultiplier;
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsSponsoredVerticalVideos;
    }

    public final boolean getBypassWidthLimitsStories() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStories;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStoriesPrefetch;
    }

    public final ConnectivityManager getConnectivityManager() {
        return null;
    }

    public final String getDataConnectionQuality() {
        return "UNKNOWN";
    }

    public final int getDefaultBwRiskConfPct() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveDefaultBwRiskConfPct;
        }
        return r0.defaultBwRiskConfPct;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return this.abrSetting.dropRenderFrameRatioForPreventAbrUp;
    }

    public final boolean getEnableBsrV2Definition() {
        return this.abrSetting.enableBsrV2Definition;
    }

    public final boolean getEnableCdnBandwidthRestriction() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableCdnBandwidthRestriction;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableSegmentBitrate;
    }

    public final boolean getEnableVodPrefetchQSFix() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableVodPrefetchQSFix;
    }

    public final boolean getForceCurrentNoWatchableFormatFrameDrop() {
        return this.abrSetting.forceCurrentNoWatchableFormatFrameDrop;
    }

    public final float getFrameDropFactor() {
        return this.abrSetting.frameDropFactor;
    }

    public final boolean getHashUrlForUnique() {
        return this.abrSetting.hashUrlForUnique;
    }

    public final int getHighBufferBandwidthConfPct() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveHighBufferBandwidthConfidencePct;
        }
        return r0.highBufferBandwidthConfidencePct;
    }

    public final double getHighOrBetterMosThreshold() {
        return this.abrSetting.highOrBetterMosThreshold;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return this.abrSetting.honorDefaultBandwidthSR;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.initSegmentBandwidthExclusionLimitBytes;
    }

    public final float getLambdaFallingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveLambdaFallingBufferConfidenceCalculator;
        }
        return r0.lambdaFallingBufferConfidenceCalculator;
    }

    public final float getLambdaRisingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveLambdaRisingBufferConfidenceCalculator;
        }
        return r0.lambdaRisingBufferConfidenceCalculator;
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAbrLatencyBasedAbrTargetBufferSizeMs;
        }
        return r0.latencyBasedTargetBufferSizeMs;
    }

    public final int getLiveDefaultMaxWidth() {
        return this.abrSetting.liveAbrDefaultMaxWidthCell;
    }

    public final int getLowBufferBandwidthConfPct() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveLowBufferBandwidthConfidencePct;
        }
        return r0.lowBufferBandwidthConfidencePct;
    }

    public final int getLowWatermarkMs() {
        if (this.isLive) {
            return 0;
        }
        return Integer.MAX_VALUE;
    }

    public final float getMainProcessBitrateMultiplier() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMainProcessBitrateEstimateMultiplier;
        }
        return r0.mainProcessBitrateEstimateMultiplier;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxAlphaLowPassEMABwDown;
        }
        return r0.maxAlphaLowPassEMABwDown;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxAlphaLowPassEMABwUp;
        }
        return r0.maxAlphaLowPassEMABwUp;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxAlphaLowPassEMABwVol;
        }
        return r0.maxAlphaLowPassEMABwVol;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxAlphaLowPassEMATtfbDown;
        }
        return r0.maxAlphaLowPassEMATtfbDown;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxAlphaLowPassEMATtfbUp;
        }
        return r0.maxAlphaLowPassEMATtfbUp;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxAlphaLowPassEMATtfbVol;
        }
        return r0.maxAlphaLowPassEMATtfbVol;
    }

    public final float getMaxBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxBandwidthMultiplier;
        }
        boolean z = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.storiesMaxBandwidthMultiplier;
        }
        return r0.maxBandwidthMultiplier;
    }

    public final long getMaxBufferedDurationFallingBufferMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            if (z2) {
                i = r0.liveStoriesMaxBufferedDurationMsFallingBuffer;
            } else {
                i = r0.liveMaxBufferedDurationMsFallingBuffer;
            }
        } else if (z2) {
            i = r0.storiesMaxBufferedDurationMsFallingBuffer;
        } else {
            i = r0.maxBufferedDurationMsFallingBuffer;
        }
        return (long) i;
    }

    public final long getMaxDurationForQualityDecreaseMs() {
        int i;
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            i = r0.liveMaxDurationForQualityDecreaseMs;
        } else {
            i = r0.maxDurationForQualityDecreaseMs;
        }
        return (long) i;
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return this.abrSetting.maxNumberSmallBwSamplesIgnored;
    }

    public final float getMaxTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxTTFBMultiplier;
        }
        boolean z = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.storiesMaxTTFBMultiplier;
        }
        return r0.maxTTFBMultiplier;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxWidthCell;
        }
        return r0.maxWidthCell;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveMaxWidthInlinePlayer;
        }
        return r0.maxWidthInlinePlayer;
    }

    public final int getMaxWidthSphericalVideo() {
        return this.abrSetting.maxWidthSphericalVideo;
    }

    public final int getMaxWidthToPrefetch() {
        boolean z;
        if (this.abrSetting.bypassPrefetchWidthLimits) {
            return Integer.MAX_VALUE;
        }
        C152587Zl r1 = this.playbackPreferences;
        synchronized (r1) {
            z = r1.A04;
        }
        if (z) {
            return this.abrSetting.maxWidthSphericalVideo;
        }
        boolean z2 = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z2) {
            return r0.liveMaxWidthToPrefetchCell;
        }
        return r0.maxWidthToPrefetchAbrCell;
    }

    public final float getMinBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinBandwidthMultiplier;
        }
        boolean z = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.storiesMinBandwidthMultiplier;
        }
        return r0.minBandwidthMultiplier;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        if (this.isLive) {
            return 0;
        }
        return this.abrSetting.minBufferedDurationMsForMosAwareCache;
    }

    public final long getMinDurationForHighBWQualityIncreaseMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            if (z2) {
                i = r0.liveStoriesMinDurationForHighBWQualityIncreaseMs;
            } else {
                i = r0.liveMinDurationForHighBWQualityIncreaseMs;
            }
        } else if (z2) {
            i = r0.storiesMinDurationForHighBWQualityIncreaseMs;
        } else {
            i = r0.minDurationForHighBWQualityIncreaseMs;
        }
        return (long) i;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return this.abrSetting.minFramesDropForPreventAbrUp;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return this.abrSetting.minFramesRenderedForPreventAbrUp;
    }

    public final int getMinMosConstraintLimit() {
        return this.abrSetting.minMosConstraintLimit;
    }

    public final int getMinMosForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.storiesMinMosForCachedQuality;
        }
        return r0.minMosForCachedQuality;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.minOverallMosForABR;
    }

    public final float getMinPartiallyCachedSpan() {
        return this.abrSetting.minPartiallyCachedSpan;
    }

    public final float getMinTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinTTFBMultiplier;
        }
        boolean z = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.storiesMinTTFBMultiplier;
        }
        return r0.minTTFBMultiplier;
    }

    public final int getMinWatchableMos() {
        int i;
        if (!this.isIGClips || (i = this.abrSetting.igClipsMinWatchableMos) <= 0) {
            return this.abrSetting.minWatchableMos;
        }
        return i;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return this.abrSetting.minWidthMultiplierFrameDrop;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.modBwRiskConfPct;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.modOverallMosForABR;
    }

    public final int getMosDiffPctForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.storiesMosDiffPctForCachedQuality;
        }
        return r0.mosDiffPctForCachedQuality;
    }

    public final float getMosPrefetchFractionByNetworkQuality() {
        return this.abrSetting.mosPrefetchFractionByNetworkQuality;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return this.abrSetting.personalizedAggressiveStallDuration;
    }

    public final int getPersonalizedBWRiskConfPctAggressive() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedBWRiskConfPctAggressive;
        }
        return r0.personalizedBWRiskConfPctAggressive;
    }

    public final int getPersonalizedBWRiskConfPctConservative() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedBWRiskConfPctConservative;
        }
        return r0.personalizedBWRiskConfPctConservative;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedBWRiskConfPctNormal;
        }
        return r0.personalizedBWRiskConfPctNormal;
    }

    public final int getPersonalizedBWRiskConfPctVeryAggressive() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedBWRiskConfPctVeryAggressive;
        }
        return r0.personalizedBWRiskConfPctVeryAggressive;
    }

    public final int getPersonalizedBWRiskConfPctVeryConservative() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedBWRiskConfPctVeryConservative;
        }
        return r0.personalizedBWRiskConfPctVeryConservative;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return this.abrSetting.personalizedConservativeStallDuration;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedRiskMultiplierAggressive;
        }
        return r0.personalizedRiskMultiplierAggressive;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedRiskMultiplierConservative;
        }
        return r0.personalizedRiskMultiplierConservative;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedRiskMultiplierVeryAggressive;
        }
        return r0.personalizedRiskMultiplierVeryAggressive;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedRiskMultiplierVeryConservative;
        }
        return r0.personalizedRiskMultiplierVeryConservative;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return this.abrSetting.personalizedVeryAggressiveStallDuration;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePersonalizedVirtualBufferPercent;
        }
        return r0.personalizedVirtualBufferPercent;
    }

    public final C152587Zl getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final int getPredictiveABRDownBufferMs() {
        return this.abrSetting.livePredictiveABRDownBufferMs;
    }

    public final int getPredictiveABRMaxSingleCycleDepletionMs() {
        return this.abrSetting.livePredictiveABRMaxSingleCycleDepletionMs;
    }

    public final float getPredictiveABRTtfbRatio() {
        return this.abrSetting.livePredictiveABRTtfbRatio;
    }

    public final int getPredictiveABRUpBufferMs() {
        return this.abrSetting.livePredictiveABRUpBufferMs;
    }

    public final boolean getPredictiveABRUpOnLiveHead() {
        return this.abrSetting.livePredictiveABRUpOnLiveHead;
    }

    public final int getPredictiveABRUpRetryIntervalMs() {
        return this.abrSetting.livePredictiveABRUpRetryIntervalMs;
    }

    public final float getPrefetchDurationMultiplier() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePrefetchDurationMultiplier;
        }
        return r0.vodPrefetchDurationMultiplier;
    }

    public final int getPrefetchLongQueueBandwidthConfPct() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePrefetchLongQueueBandwidthConfidencePct;
        }
        return r0.prefetchLongQueueBandwidthConfidencePct;
    }

    public final float getPrefetchLongQueueBandwidthFraction() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAbrPrefetchLongQueueBandwidthFraction;
        }
        return r0.prefetchLongQueueBandwidthFraction;
    }

    public final int getPrefetchLongQueueSizeThreshold() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAbrPrefetchLongQueueSizeThreshold;
        }
        return r0.prefetchLongQueueSizeThreshold;
    }

    public final int getPrefetchShortQueueBandwidthConfPct() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.livePrefetchShortQueueBandwidthConfidencePct;
        }
        return r0.prefetchShortQueueBandwidthConfidencePct;
    }

    public final float getPrefetchShortQueueBandwidthFraction() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveAbrPrefetchShortQueueBandwidthFraction;
        }
        return r0.prefetchShortQueueBandwidthFraction;
    }

    public final int getRiskRewardRatioBufferLimitMs() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveRiskRewardRatioBufferLimitMs;
        }
        return r0.riskRewardRatioBufferLimitMs;
    }

    public final float getRiskRewardRatioLowerBound() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveRiskRewardRatioLowerBound;
        }
        return r0.riskRewardRatioLowerBound;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return this.abrSetting.liveRiskRewardRatioUpperBound;
        }
        if (this.isStory) {
            float f = this.abrSetting.riskRewardRatioUpperBoundSfv;
            if (((double) f) > 0.0d) {
                return f;
            }
        }
        return this.abrSetting.riskRewardRatioUpperBound;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveScreenWidthMultiplierLandscapeVideo;
        }
        return r0.screenWidthMultiplierLandscapeVideo;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveScreenWidthMultiplierPortraitVideo;
        }
        return r0.screenWidthMultiplierPortraitVideo;
    }

    public final boolean getServerSideForwardBwe() {
        if (this.isLive) {
            return this.abrSetting.serverSideForwardBwe;
        }
        return false;
    }

    public final boolean getShouldAvoidOnCellular() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveShouldAvoidOnCellular;
        }
        return r0.enableAvoidOnCellular;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return this.abrSetting.shouldCountFirstChunkOnly;
    }

    public final boolean getShouldEnableAudioIbr() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveEnableAudioIbrEvaluator;
        }
        return r0.enableAudioIbrEvaluator;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveEnableAudioIbrCache;
        }
        return r0.enableAudioIbrCache;
    }

    public final boolean getShouldEnableBwOnlyEstimationForLongPoll() {
        return this.abrSetting.enableBwOnlyEstimationForLongPoll;
    }

    public final boolean getShouldEnableMultiAudioSupport() {
        return this.abrSetting.enableMultiAudioSupport;
    }

    public final boolean getShouldEnableTtfbOnlyEstimation() {
        return this.abrSetting.enableTtfbOnlyEstimation;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return this.abrSetting.treatShortFormAsStories;
    }

    public final boolean getShouldUseServerSideGoodput() {
        return this.abrSetting.shouldUseServerSideGoodput;
    }

    public final boolean getSkipCachedAsCurrent() {
        return this.abrSetting.skipCachedAsCurrent;
    }

    public final double getSmartCacheOverrideThreshold() {
        return this.abrSetting.smartCacheOverrideThreshold;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return this.abrSetting.smartCacheOverridePrefetchThreshold;
    }

    public final float getSoftMinMosBandwidthFractionForAbrSelector() {
        return this.abrSetting.softMinMosBandwidthFractionForAbrSelector;
    }

    public final float getSoftMinMosForAbrSelector() {
        return this.abrSetting.softMinMosForAbrSelector;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeAcrossVideosMs;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeMs;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveSystemicRiskAvgSegmentDurationMs;
        }
        return r0.systemicRiskAvgSegmentDurationMs;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (!z) {
            return 1.0d;
        }
        boolean z2 = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z2) {
            return r0.liveSystemicRiskAudioBitrateBoostFactor;
        }
        return r0.systemicRiskAudioBitrateBoostFactor;
    }

    public final boolean getSystemicRiskEnable(boolean z) {
        boolean z2;
        boolean z3 = this.isLive;
        if (z) {
            AnonymousClass8L1 r0 = this.abrSetting;
            if (z3) {
                return r0.liveSystemicRiskAudioEnable;
            }
            return r0.systemicRiskAudioEnable;
        }
        if (z3) {
            AnonymousClass8L1 r1 = this.abrSetting;
            if (!r1.systemicRiskEnable) {
                return false;
            }
            z2 = r1.liveSystemicRiskEnable;
        } else {
            boolean z4 = this.isStory;
            AnonymousClass8L1 r02 = this.abrSetting;
            boolean z5 = r02.systemicRiskEnable;
            if (!z4) {
                return z5;
            }
            if (!z5) {
                return false;
            }
            z2 = r02.systemicRiskEnableForStories;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z2) {
            return r0.liveSystemicRiskAudioEnableDynOtherBitrate;
        }
        return r0.systemicRiskAudioEnableDynOtherBitrate;
    }

    public final boolean getSystemicRiskEnableForPrefetch() {
        return this.abrSetting.systemicRiskEnableForPrefetch;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            AnonymousClass8L1 r0 = this.abrSetting;
            if (z2) {
                return r0.liveSystemicRiskAudioLowMosFactor;
            }
            return r0.systemicRiskAudioLowMosFactor;
        } else if (z2) {
            return this.abrSetting.liveSystemicRiskLowMosFactor;
        } else {
            if (this.isIGClips) {
                double d = this.abrSetting.systemicRiskLowMosFactorForIgClips;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.systemicRiskLowMosFactor;
        }
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveSystemicRiskMaxLookaheadDurationMs;
        }
        return r0.systemicRiskMaxLookaheadDurationMs;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.systemicRiskModMosFactor;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (!z) {
            return 0;
        }
        boolean z2 = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z2) {
            return r0.liveSystemicRiskAudioOtherBitrate;
        }
        return r0.systemicRiskAudioOtherBitrate;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return this.abrSetting.ttfbWeightLimitForBWEDampening;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveTreatCurrentNullAsLowBuffer;
        }
        return r0.treatCurrentNullAsLowBuffer;
    }

    public final int getTtfbMsecWithServerSideGoodput() {
        return this.abrSetting.ttfbMsecWithServerSideGoodput;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return this.abrSetting.useDefaultFormatAsBackupForScreenWidthConstraints;
    }

    public final boolean getUsePlaybackCsvqm() {
        return this.abrSetting.usePlaybackCsvqm;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.usePlaybackMosForLowMosABR;
    }

    public final boolean getUseUnifiedUploadMos() {
        return this.abrSetting.useUnifiedUploadMos;
    }

    public final int getVeryHighBufferDurationMsForBandwidthBoost() {
        boolean z;
        if (this.abrSetting.veryHighBufferDurationMsForBandwidthBoostIG >= 0) {
            C152587Zl r1 = this.playbackPreferences;
            synchronized (r1) {
                z = r1.A05;
            }
            if (z && this.isIGStory) {
                return this.abrSetting.veryHighBufferDurationMsForBandwidthBoostIG;
            }
        }
        if (this.isLive) {
            return -1;
        }
        return this.abrSetting.veryHighBufferDurationMsForBandwidthBoost;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnWifi() {
        return false;
    }

    public final boolean overrideCacheWhenHighMos() {
        if (!this.isStory || !this.abrSetting.overrideCacheWhenHighMos) {
            return false;
        }
        return true;
    }

    public final boolean overrideCacheWhenHighMosForPrefetch() {
        if (!this.isStory || !this.abrSetting.overrideCacheWhenHighMosForPrefetch) {
            return false;
        }
        return true;
    }

    public final boolean shouldAlwaysPlayCachedData() {
        if (this.isLive) {
            return this.abrSetting.alwaysPlayLiveCachedData;
        }
        return false;
    }

    public final boolean shouldAvoidOnABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.shouldEnableAvoidOnABR;
    }

    public final boolean shouldDeleteNonSR() {
        return this.abrSetting.shouldDeleteNonSR;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return this.abrSetting.shouldDeprecateLiveInitialABR;
    }

    public final boolean shouldExcludeCDNResponseTimeForLongPoll() {
        return this.abrSetting.removeCDNResponseTimeForLongPoll;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return this.abrSetting.shouldLogInbandTelemetryBweDebugString;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }

    public final boolean shouldSelectIntermediateFormatRiskRewardBased() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveSelectIntermediateFormatRiskRewardBased;
        }
        return r0.selectIntermediateFormatRiskRewardBased;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.useLogarithmicRisk;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveShouldUseLowPassEMAAsymmetryForBWEstimation;
        }
        return r0.shouldUseLowPassEMAAsymmetryForBWEstimation;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveShouldUseLowPassEMAForBWEstimation;
        }
        return r0.shouldUseLowPassEMAForBWEstimation;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveShouldUseLowPassWithWeightedEMAForBWEstimation;
        }
        return r0.shouldUseLowPassWithWeightedEMAForBWEstimation;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useMosAwareCachedSelection;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (z) {
            return false;
        }
        boolean z2 = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z2) {
            return r0.liveUseRiskRewardRatio;
        }
        return r0.useRiskRewardRatio;
    }

    public final boolean updateFormatsWithIntentionChange() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveUpdateFormatsWithIntentionChange;
        }
        return r0.updateFormatsWithIntentionChange;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForABRIfLower;
        }
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForAOCIfLower;
        }
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useOverallMosForABR;
    }

    public final boolean usePersonalizedBWRiskConfPcts() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveUsePersonalizedBWRiskConfPcts;
        }
        return r0.usePersonalizedBWRiskConfPcts;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveUsePersonalizedRiskMultipliers;
        }
        return r0.usePersonalizedRiskMultipliers;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        boolean z = this.isLive;
        AnonymousClass8L1 r0 = this.abrSetting;
        if (z) {
            return r0.liveUsePersonalizedVirtualBuffer;
        }
        return r0.usePersonalizedVirtualBuffer;
    }

    public AbrContextAwareConfiguration(AnonymousClass8L1 r5, AnonymousClass707 r6, C152587Zl r7, boolean z, boolean z2) {
        String str;
        String str2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C18260x0.A0R(r5, r7);
        this.abrSetting = r5;
        this.connectivityManagerHolder = r6;
        this.playbackPreferences = r7;
        this.isLive = z;
        synchronized (r7) {
            str = r7.A00;
        }
        synchronized (r7) {
            str2 = r7.A01;
        }
        boolean z7 = false;
        if ("fb_stories".equalsIgnoreCase(str) || (this.abrSetting.treatShortFormAsStories && ("fb_shorts_viewer".equalsIgnoreCase(str2) || "fb_shorts_native_in_feed_unit".equalsIgnoreCase(str2)))) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isStory = z3;
        this.isIGStory = "reel_feed_timeline".equalsIgnoreCase(str);
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C162457s7.A0D(lowerCase);
            z7 = lowerCase.startsWith("clips_viewer_");
        }
        this.isIGClips = z7;
        synchronized (r7) {
            z4 = r7.A06;
        }
        this.isThumbnail = z4;
        synchronized (r7) {
            z5 = r7.A05;
        }
        this.isSponsored = z5;
        synchronized (r7) {
            z6 = r7.A03;
        }
        this.isBackgroundPrefetch = z6;
        this.enableForegroundPrefetchQualityExperimentation = r7.A02;
        this.isPrefetch = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getMaxInitialBitrate() {
        /*
            r5 = this;
            boolean r0 = r5.getEnableInitialBitrateBoosterByNetworkQuality()
            if (r0 == 0) goto L_0x0034
            com.facebook.common.networkbasic.ConnectionQuality r2 = com.facebook.common.networkbasic.ConnectionQuality.UNKNOWN
            java.lang.String r0 = "UNKNOWN"
            com.facebook.common.networkbasic.ConnectionQuality r2 = com.facebook.common.networkbasic.ConnectionQuality.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x000e }
        L_0x000e:
            com.facebook.common.networkbasic.ConnectionQuality r0 = com.facebook.common.networkbasic.ConnectionQuality.UNKNOWN
            if (r2 == r0) goto L_0x0034
            int r1 = r2.ordinal()
            com.facebook.common.networkbasic.ConnectionQuality r0 = com.facebook.common.networkbasic.ConnectionQuality.MODERATE
            int r0 = r0.ordinal()
            if (r1 <= r0) goto L_0x0034
            int r1 = r2.ordinal()
            com.facebook.common.networkbasic.ConnectionQuality r0 = com.facebook.common.networkbasic.ConnectionQuality.MODERATE
            int r0 = r0.ordinal()
            int r1 = r1 - r0
            float r0 = r5.getInitialBitrateBoosterByNetworkQuality()
            double r2 = (double) r0
            double r0 = (double) r1
            double r3 = java.lang.Math.pow(r2, r0)
            goto L_0x0036
        L_0x0034:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0036:
            boolean r1 = r5.isLive
            X.8L1 r0 = r5.abrSetting
            if (r1 == 0) goto L_0x0042
            int r0 = r0.liveInitialBitrate
        L_0x003e:
            double r1 = (double) r0
            double r1 = r1 * r3
            int r0 = (int) r1
            return r0
        L_0x0042:
            int r0 = r0.maxInitialBitrate
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getMaxInitialBitrate():int");
    }
}
