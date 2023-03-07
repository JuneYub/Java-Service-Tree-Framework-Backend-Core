package com.arms.sample.account.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserStatus {
	JOIN("join"),
	CANCEL("cancel");
	private final String description;
}
